package com.caas;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by caoxin on 2018/3/29.
 */
@RestController
public class EurekaClientController {
    @Value("${server.port}")
    String port;
    @GetMapping("/client")
    public String home(@RequestParam String name) {
        return "Hello" + name + ",i am from port:" + port;
    }
}
