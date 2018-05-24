/**
 * File Name: SleuthUserApplication.java
 * Author: Xin Cao
 * Company: BOE
 * Date: 2018-04-21
 * Description: Spring Cloud Sleuth Test Program , provider Web Services.
 */
package com.boe.caas.sleuth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

//Sprin Boot核心注解
@SpringBootApplication
//Eureka注册客户端注解
@EnableEurekaClient
public class SleuthUserApplication {
    public static void main(String[] args) {
        SpringApplication.run(SleuthUserApplication.class, args);
    }
}
