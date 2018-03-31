package com.caas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by caoxin on 2018/3/30.
 */
@RestController
public class HelloController {
    @Autowired
    HelloService helloService;
    @GetMapping("/client")
    public String sayHello(@RequestParam(defaultValue = "caoxin", required = false) String name) {
        return helloService.sayHello(name);
    }
}
