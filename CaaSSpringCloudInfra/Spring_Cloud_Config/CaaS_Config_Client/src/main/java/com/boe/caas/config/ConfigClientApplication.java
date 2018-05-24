/**
 * File Name: ConfigClientApplication.java
 * Author: Xin Cao
 * Company: BOE
 * Date: 2018-04-21
 * Description: Spring Cloud Config Test Program , provider Web Services.
 */
package com.boe.caas.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Sprin Boot核心注解
@SpringBootApplication
//应用映射控制器
@RestController
//Eureka注册客户端注解
@EnableEurekaClient
public class ConfigClientApplication {
    public static void main(String[] args) {
        //启动服务 - 使用封装容器
        SpringApplication.run(ConfigClientApplication.class, args);
    }
    //获取版本号
    @Value("${boecaas}")
    String boecaas;
    @RequestMapping(value = "/boecaas")
    public String hello() {
        return boecaas;
    }
}
