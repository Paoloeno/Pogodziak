package pl.nowosielski.pogodziak20.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.nowosielski.pogodziak20.models.services.FiveDayWeatherService;

import java.util.List;

@Controller
public class FiveDayController {

    private FiveDayWeatherService fiveDayWeatherService;

    @Autowired
    public FiveDayController(FiveDayWeatherService fiveDayWeatherService){
        this.fiveDayWeatherService = fiveDayWeatherService;
    }

    @GetMapping("/fiveDayWeather")
    public String fiveDayWeather(){
        return "fiveDayWeather";
    }

    @PostMapping("/fiveDayWeather")
    public String fiveDayWeather(@RequestParam("city") String city, Model model){

        List jsonWeatherList = fiveDayWeatherService.getListOfJsonWeathers(city);
        List modelWeatherList = fiveDayWeatherService.convertJsonsToModels(jsonWeatherList);
        fiveDayWeatherService.formatParameters(modelWeatherList, model);
        model.addAttribute("city", city);

        return "fiveDayWeather";
    }
}
