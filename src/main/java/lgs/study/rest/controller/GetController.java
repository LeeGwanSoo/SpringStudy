package lgs.study.rest.controller;

import lgs.study.rest.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class GetController {

    // http://localhost:8080/hello1
    @RequestMapping(value = "/hello1", method = RequestMethod.GET)
    public String getHello1(){
        return "Hello RequestMapping";
    }

    // http://localhost:8080/hello2
    @GetMapping(value = "/hello2")
    public String getHello2(){
        return "Hello GetMapping";
    }

    // http://localhost:8080/variable1/lgs
    @GetMapping(value = "/variable1/{name}")
    public String getName1(@PathVariable String name){
        return "Hello name :" + name;
    }

    // http://localhost:8080/variable2/lgs
    @GetMapping(value = "/variable2/{name}")
    public String getName2(@PathVariable("name") String str){
        return "Hello str :" + str;
    }

    // http://localhost:8080/param1?name=lgs&age=37&email=abc@naver.com
    @GetMapping(value = "/param1")
    public String getParam(@RequestParam String name,
                           @RequestParam Integer age,
                           @RequestParam String email){
        return "name :" + name + " age :" + age + " email :" + email ;
    }

    // map 으로 받은 값들을 key : value 로 출력
    // http://localhost:8080/param2?param1=lgs&param2=37&param3=abc@naver.com
    @GetMapping(value = "/param2")
    public String getParam2(@RequestParam Map<String,String> param){
        StringBuilder sb = new StringBuilder();

        param.forEach((key, value) -> sb.append(key).append(" : ").append(value).append("\n"));

        return sb.toString();
    }

    // DTO 사용
    // http://localhost:8080/param3?name=lgs&age=37&email=abc@naver.com
    @GetMapping(value = "/param3")
    public String getParam3(UserDTO userDTO){
        return userDTO.toString();
    }

    // DTO 사용
    // http://localhost:8080/param4?name=lgs&age=37&email=abc@naver.com
    @GetMapping(value = "/param4")
    public UserDTO getParam4(UserDTO userDTO){
        return userDTO;
    }

    // HashMap 으로 리턴
    // http://localhost:8080/param5?name=lgs&age=37&email=abc@naver.com
    @GetMapping(value = "/param5")
    public HashMap<String,Object> getParam5(UserDTO userDTO){
        HashMap<String,Object> hashMap = new HashMap<>();
        hashMap.put("resultCode", "0000");
        hashMap.put("resultMsg", "성공");
        hashMap.put("userDto", userDTO);
        return hashMap;
    }

}
