package com.caas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by caoxin on 2018/3/29.
 */
@RestController
public class RestTestController {
    @GetMapping("/testRest")
    public String testRest() {
        RestTemplate restTemplate=new RestTemplate();
        return restTemplate.getForObject("https://www.baidu.com/", String.class);
    }
}
