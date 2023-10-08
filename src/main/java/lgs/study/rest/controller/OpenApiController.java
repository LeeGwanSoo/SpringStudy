package lgs.study.rest.controller;

import lgs.study.rest.dto.WeatherDto;
import lgs.study.rest.service.RestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class OpenApiController {

    @Autowired
    RestService restService;

    @GetMapping(value = "/weather/{city}")
    public WeatherDto getWeather(@PathVariable String city){

        return restService.getWeather(city);

    }
}
