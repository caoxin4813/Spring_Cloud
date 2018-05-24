/**
 * File Name: ZipkinServerApplication.java
 * Author: Xin Cao
 * Company: BOE
 * Date: 2018-04-21
 * Description: Spring Cloud Zipkin Server Main Program , provider LinkTrace Services.
 */
package com.boe.caas.sleuth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;
import zipkin.server.EnableZipkinServer;

//开启支持ElasticSearch与RabbitMQ的Zipkin注解
@EnableZipkinStreamServer
//Sprin Boot核心注解
@SpringBootApplication
//Eureka注册客户端注解
@EnableEurekaClient
public class ZipkinServerApplication {
    public static void main(String[] args) {
        //启动服务 - 使用封装容器
        SpringApplication.run(ZipkinServerApplication.class, args);
    }
}
