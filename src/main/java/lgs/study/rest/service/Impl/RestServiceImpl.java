package lgs.study.rest.service.Impl;

import lgs.study.rest.service.RestService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class RestServiceImpl implements RestService {

    @Override
    public Map<String, String> getWeather(String city) {

        Map<String, String> result = new HashMap<String, String>();

        RestTemplate restTemplate = new RestTemplate();

        String externalUrl = "https://goweather.herokuapp.com/weather/"+city; // 외부 URL 설정

        ResponseEntity<String> response = restTemplate.getForEntity(externalUrl, String.class);

        String responseBody = response.getBody();

        result.put("responseBody", responseBody.toString());
        return result;
    }
}
