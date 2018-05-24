/**
 * File Name: ConfigServerApplication.java
 * Author: Xin Cao
 * Company: BOE
 * Date: 2018-04-21
 * Description: Spring Cloud Config Server Main Program , provider Configuration Center Services.
 */
package com.boe.caas.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

//Sprin Boot核心注解
@SpringBootApplication
//启用配置中心服务
@EnableConfigServer
//Eureka注册客户端注解
@EnableEurekaClient
public class ConfigServerApplication {
    public static void main(String[] args) {
        //启动服务 - 使用封装容器
        SpringApplication.run(ConfigServerApplication.class, args);
    }
}
