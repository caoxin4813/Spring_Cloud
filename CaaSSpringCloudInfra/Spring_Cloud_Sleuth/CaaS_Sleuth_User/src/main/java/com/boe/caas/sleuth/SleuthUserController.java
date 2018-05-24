/**
 * File Name: SleuthUserController.java
 * Author: Xin Cao
 * Company: BOE
 * Date: 2018-04-21
 * Description: Spring Cloud Sleuth Test Controller , provider test address.
 */
package com.boe.caas.sleuth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//使用控制器
@RestController
//服务地址
@RequestMapping("/user")
public class SleuthUserController {
    @GetMapping("/hello")
    public String hello() {
        return "I'm caoxin.";
    }
}
