package pl.nowosielski.pogodziak20.models.weather.countries;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Country {

    @JsonProperty("code")
    public String code;

    @JsonProperty("name_en")
    public String nameEN;

    @JsonProperty("name_pl")
    public String namePL;
}
