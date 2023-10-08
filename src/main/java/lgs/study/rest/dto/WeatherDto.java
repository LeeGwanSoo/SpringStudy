package lgs.study.rest.dto;

import lombok.*;

import java.util.List;

@Data
public class WeatherDto {
    String temperature;
    String wind;
    String description;

    List<ForecastDto> forecast;
}
