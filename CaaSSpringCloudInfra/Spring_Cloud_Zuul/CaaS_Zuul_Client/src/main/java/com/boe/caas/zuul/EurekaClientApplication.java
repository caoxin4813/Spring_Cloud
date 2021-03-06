/**
 * File Name: EurekaClientApplication.java
 * Author: Xin Cao
 * Company: BOE
 * Date: 2018-04-20
 * Description: Spring Cloud Zuul Test Program , provider Web Services.
 */
package com.boe.caas.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

//Sprin Boot核心注解
@SpringBootApplication
//Eureka注册客户端注解
@EnableEurekaClient
public class EurekaClientApplication {
    public static void main(String[] args) {
        //启动服务 - 使用封装容器
        SpringApplication.run(EurekaClientApplication.class, args);
    }
}
