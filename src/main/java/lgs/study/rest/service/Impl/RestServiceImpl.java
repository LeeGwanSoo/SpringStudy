package lgs.study.rest.service.Impl;

import lgs.study.rest.dto.WeatherDto;
import lgs.study.rest.service.RestService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class RestServiceImpl implements RestService {

    @Override
    public WeatherDto getWeather(String city) {

        RestTemplate restTemplate = new RestTemplate();

        String externalUrl = "https://goweather.herokuapp.com/weather/"+city; // 외부 URL 설정

        ResponseEntity<WeatherDto> response = restTemplate.getForEntity(externalUrl, WeatherDto.class);

        return response.getBody();
    }
}
