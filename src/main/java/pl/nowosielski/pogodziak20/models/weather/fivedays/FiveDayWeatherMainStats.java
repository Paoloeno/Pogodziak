package pl.nowosielski.pogodziak20.models.weather.fivedays;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class FiveDayWeatherMainStats {

    @JsonProperty("temp")
    private double temperatureInKelwin;

    private String stringTemperature;

    public FiveDayWeatherMainStats(double temperatureInKelwin){
        this.temperatureInKelwin = temperatureInKelwin;
    }
}
