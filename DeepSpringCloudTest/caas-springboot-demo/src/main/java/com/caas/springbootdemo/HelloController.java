package com.caas.springbootdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by caoxin on 2018/3/27.
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
