package pl.nowosielski.pogodziak20.models.weather.current;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class WeatherCloudsStats {

    @JsonProperty("all")
    private double percentageCloudiness;
}
