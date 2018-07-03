package pl.nowosielski.pogodziak20.models.weather.fivedays;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class FiveDayWeatherModel {

    @JsonProperty("dt_txt")
    private String weatherHour;

    private String date;
    private String hour;

    @JsonProperty("main")
    private FiveDayWeatherMainStats fiveDayWeatherMainStats;

}
