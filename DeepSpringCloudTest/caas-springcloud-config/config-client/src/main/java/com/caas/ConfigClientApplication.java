package com.caas;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by caoxin on 2018/4/2.
 */
@SpringBootApplication
@RestController
public class ConfigClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class, args);
    }
    @Value("${foo}")
    String foo;
    @RequestMapping(value = "/foo")
    public String hello() {
        return foo;
    }
}
