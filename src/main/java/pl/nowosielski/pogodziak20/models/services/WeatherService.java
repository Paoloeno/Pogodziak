package pl.nowosielski.pogodziak20.models.services;

import com.neovisionaries.i18n.CountryCode;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import pl.nowosielski.pogodziak20.models.weather.countries.Country;
import pl.nowosielski.pogodziak20.models.weather.current.WeatherModel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class WeatherService {

    @Value("${openweathermap.api_key}")
    private String apiKey;
    private RestTemplate restTemplate;
    public WeatherService(){
        /* DO UŻYCIA W PRACY
        SimpleClientHttpRequestFactory clientHttpReq = new SimpleClientHttpRequestFactory();
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("proxypzu.pzu.pl",8080));
        clientHttpReq.setProxy(proxy);
        */
        restTemplate = new RestTemplate();
    }

    public WeatherModel makeCall(String city) {
        String call = "http://api.openweathermap.org/data/2.5/weather?q="+city+"&appid="+apiKey;

        try {
            return restTemplate.getForObject(call, WeatherModel.class);
        }catch (HttpClientErrorException e){
            WeatherModel model = new WeatherModel();
            return model;
        }
    }

    public String cityFormat(WeatherModel weatherModel) {
        return weatherModel.getCityName();
    }

    public String countryFormat(WeatherModel weatherModel) {
        translateCountryToPolish(weatherModel);
        return weatherModel.getSunStats().getCountry();
    }

    public String temperatureFormat(WeatherModel weatherModel) {
        return String.format( "%.1f", weatherModel.getMainStats().getTemperatureInKelwin() - 273.15) + "°C";
    }

    public String pressureFormat(WeatherModel weatherModel) {
        return String.format("%.0f", weatherModel.getMainStats().getPressure()) + " hPa";
    }

    public String humidityFormat(WeatherModel weatherModel){
        return String.format("%.0f", weatherModel.getMainStats().getHumidity()) + "%";
    }

    public String cloudinessFormat(WeatherModel weatherModel){
        return String.format("%.0f" , weatherModel.getCloudsStats().getPercentageCloudiness()) + "%";
    }

    public String sunriseFormat(WeatherModel weatherModel){

        Date sunrise = new Date(weatherModel.getSunStats().getSunriseInSeconds()*1000);
        int hour = sunrise.getHours();
        int minutes = sunrise.getMinutes();

        return timeFormat(hour, minutes);
    }

    public String sunsetFormat(WeatherModel weatherModel){
        Date sunset = new Date(weatherModel.getSunStats().getSunsetInSeconds()*1000);
        int hour = sunset.getHours();
        int minutes = sunset.getMinutes();

        return timeFormat(hour, minutes);
    }

    public String timeFormat(int hours, int minutes){
        if(hours < 10 && minutes<10)
            return "0"+hours+":"+"0"+minutes;
        else if(hours >= 10 && minutes<10)
            return hours+":"+"0"+minutes;
        else if(hours < 10 && minutes>=10)
            return "0"+hours+":"+minutes;
        else
            return hours+":"+minutes;
    }

    public void translateCountryToPolish(WeatherModel weatherModel){
        CountryCode countryCode = CountryCode.getByCode(weatherModel.getSunStats().getCountry());
        String code = countryCode.getAlpha2();

        JSONParser parser = new JSONParser();
        JSONArray countryList = null;
        try {
            Object object = parser.parse(Country.countriesJson);
            countryList = (JSONArray) object;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        for (Object country: countryList) {
            JSONObject tmpCountry = (JSONObject)country;
            String tmpCode = (String)tmpCountry.get("code");
            if(tmpCode.equals(code)){
                weatherModel.getSunStats().setCountry((String)tmpCountry.get("name_pl"));
            }
        }
    }
}
