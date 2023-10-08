package lgs.study.rest.dto;

import lombok.Data;

@Data
public class ForecastDto {
    String day;
    String temperature;
    String wind;
}
