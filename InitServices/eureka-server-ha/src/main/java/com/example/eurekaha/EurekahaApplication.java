package com.example.eurekaha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by caoxin on 2018/3/27.
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekahaApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekahaApplication.class, args);
    }
}
