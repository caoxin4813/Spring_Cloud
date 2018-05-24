/**
 * File Name: EurekaClientApplication.java
 * Author: Xin Cao
 * Company: BOE
 * Date: 2018-04-20
 * Description: Spring Cloud Zuul Test Controller , provider Web Services.
 */
package com.boe.caas.zuul;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//提供映射服务
@RestController
public class EurekaClientController {
    @Value("${server.port}")
    String port;
    @GetMapping("/hello")
    public String home(@RequestParam String name) {
        return "Hello, "+name+" I'm from port: "+port;
    }
}
