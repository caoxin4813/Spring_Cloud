/**
 * File Name: SleuthGatewayApplication.java
 * Author: Xin Cao
 * Company: BOE
 * Date: 2018-04-21
 * Description: Spring Cloud Zipkin Gateway Test Program , provider Gateway Services for test.
 */
package com.boe.caas.sleuth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

//Sprin Boot核心注解
@SpringBootApplication
//Zuul网关注解
@EnableZuulProxy
//Eureka注册客户端注解
@EnableEurekaClient
public class SleuthGatewayApplication {
    public static void main(String[] args) {
        //启动服务 - 使用封装容器
        SpringApplication.run(SleuthGatewayApplication.class, args);
    }
}
