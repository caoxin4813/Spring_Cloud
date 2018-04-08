package com.caas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by caoxin on 2018/4/8.
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping("/hello")
    public String hello(){
        return "I'm caoxin.";
    }
}
