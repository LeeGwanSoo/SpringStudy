package lgs.study.rest.controller;

import lgs.study.rest.dto.UserDTO;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class PostController {

    // http://localhost:8080/hello1
    @RequestMapping(value = "/hello1", method = RequestMethod.POST)
    public String postHello1(){
        return "hello RequestMapping POST";
    }

    // http://localhost:8080/hello2
    @PostMapping(value = "/hello2")
    public String postHello2(){
        return "hello PostMapping";
    }

    // http://localhost:8080/variable1/lgs
    @PostMapping(value = "/variable1/{name}")
    public String postName1(@PathVariable String name){
        return "Hello name :" + name;
    }

    // map 으로 받은 값들을 key : value 로 출력
    // http://localhost:8080/param
    // { "param1":"lgs","param2":37,"param3":"abc@naver.com" }
    @PostMapping(value = "/param")
    public String getParam(@RequestBody Map<String,Object> param){
        StringBuilder sb = new StringBuilder();

        param.forEach((key, value) -> sb.append(key).append(" : ").append(value).append("\n"));

        return sb.toString();
    }

    // http://localhost:8080/param2
    // { "name":"lgs","age":37,"email":"abc@naver.com" }
    @PostMapping(value = "/param2")
    public UserDTO getParam2(@RequestBody UserDTO userDTO){
        return userDTO;
    }

}
