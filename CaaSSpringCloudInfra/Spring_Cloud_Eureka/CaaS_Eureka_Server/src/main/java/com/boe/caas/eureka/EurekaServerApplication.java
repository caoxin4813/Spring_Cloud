/**
 * File Name: EurekaServerApplication.java
 * Author: Xin Cao
 * Company: BOE
 * Date: 2018-04-20
 * Description: Spring Cloud Eureka Main Program , provider Registry and Discovery Services.
 */
package com.boe.caas.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

//Sprin Boot核心注解
@SpringBootApplication
//Eureka服务中心注解
@EnableEurekaServer
public class EurekaServerApplication {
    public static void main(String[] args) {
        //启动服务 - 使用封装容器
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}
