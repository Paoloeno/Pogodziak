package pl.nowosielski.pogodziak20.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.nowosielski.pogodziak20.models.services.WeatherService;
import pl.nowosielski.pogodziak20.models.weather.current.WeatherModel;

@Controller
public class MainController {

    private WeatherService weatherService;

    @Autowired
    public MainController(WeatherService weatherService){
        this.weatherService = weatherService;
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/")
    public String index(@RequestParam("city") String city,
                        Model model){

        WeatherModel weatherInfo = weatherService.makeCall(city);

        model.addAttribute("city", weatherService.cityFormat(weatherInfo));
        model.addAttribute("country", weatherService.countryFormat(weatherInfo));
        model.addAttribute("temperature", weatherService.temperatureFormat(weatherInfo));
        model.addAttribute("pressure", weatherService.pressureFormat(weatherInfo));
        model.addAttribute("humidity", weatherService.humidityFormat(weatherInfo));
        model.addAttribute("cloudiness", weatherService.cloudinessFormat(weatherInfo));
        model.addAttribute("sunrise", weatherService.sunriseFormat(weatherInfo));
        model.addAttribute("sunset", weatherService.sunsetFormat(weatherInfo));

        return "index";
    }
}
