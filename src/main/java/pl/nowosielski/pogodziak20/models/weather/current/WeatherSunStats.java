package pl.nowosielski.pogodziak20.models.weather.current;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class WeatherSunStats {

    @JsonProperty("sunrise")
    private long sunriseInSeconds;

    @JsonProperty("sunset")
    private long sunsetInSeconds;

    @JsonProperty("country")
    private String country;
}
