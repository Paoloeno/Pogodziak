package pl.nowosielski.pogodziak20.models.services;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.client.RestTemplate;
import pl.nowosielski.pogodziak20.models.weather.fivedays.FiveDayWeatherMainStats;
import pl.nowosielski.pogodziak20.models.weather.fivedays.FiveDayWeatherModel;

import java.util.ArrayList;
import java.util.List;


@Service
public class FiveDayWeatherService {

    @Value("${openweathermap.api_key}")
    private String apiKey;

    private RestTemplate restTemplate;

    public FiveDayWeatherService(){
        restTemplate = new RestTemplate();
    }

    public List<JSONObject> getListOfJsonWeathers(String city) {

        List<JSONObject> listOfweathers = new ArrayList<>();
        JSONParser parser = new JSONParser();
        String json = restTemplate.getForObject(
                "http://api.openweathermap.org/data/2.5/forecast?q="+city+"&appid="+apiKey, String.class);

        try {
            Object object = parser.parse(json);
            JSONObject jsonObject = (JSONObject) object;
            JSONArray weathers = (JSONArray) jsonObject.get("list");

            for (int i = 0; i < weathers.size() ; i++) {
                JSONObject weather = (JSONObject)weathers.get(i);
                listOfweathers.add(weather);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return listOfweathers;
    }

    public List<FiveDayWeatherModel> convertJsonsToModels (List<JSONObject> list){

        List modelList = new ArrayList();

        for (int i = 0; i < list.size(); i++) {

            JSONObject json = list.get(i);
            String hour = (String)json.get("dt_txt");
            JSONObject mainStats = (JSONObject)json.get("main");
            double temperature = (double)mainStats.get("temp");

            FiveDayWeatherModel fiveDayWeatherModel = new FiveDayWeatherModel();
                fiveDayWeatherModel.setWeatherHour(hour);
                fiveDayWeatherModel.setFiveDayWeatherMainStats(new FiveDayWeatherMainStats(temperature));

            modelList.add(fiveDayWeatherModel);
        }

        return modelList;
    }

    public void formatParameters(List<FiveDayWeatherModel> list, Model model){

        for (int i = 0; i < list.size(); i++) {

            FiveDayWeatherModel a = list.get(i);

            double temp = a.getFiveDayWeatherMainStats().getTemperatureInKelwin() - 273.15;
            String temperature = String.format( "%.1f", temp) + "°C";
            a.getFiveDayWeatherMainStats().setStringTemperature(temperature);

            String date = a.getWeatherHour().substring(0,10);
            a.setDate(date);
            String hour = a.getWeatherHour().substring(11,16);
            a.setHour(hour);

            model.addAttribute("record"+i, list.get(i));
        }
    }
}
