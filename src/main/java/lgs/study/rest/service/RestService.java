package lgs.study.rest.service;

import lgs.study.rest.dto.WeatherDto;

public interface RestService {

    WeatherDto getWeather(String city);
}
