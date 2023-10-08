package lgs.study.rest.controller;

import lgs.study.rest.service.RestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.HashMap;
import java.util.Map;

@Controller
public class OpenApiController {

    @Autowired
    RestService restService;

    @GetMapping(value = "/weather/{city}")
    public Map<String, String> getWeather(@PathVariable String city){
        Map<String, String> map = new HashMap<String, String>();

        map = restService.getWeather(city);
        return  map;
    }

}
