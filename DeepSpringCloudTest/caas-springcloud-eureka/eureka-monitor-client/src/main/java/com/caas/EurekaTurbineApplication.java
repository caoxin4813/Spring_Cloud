package com.caas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * Created by caoxin on 2018/3/31.
 */
@SpringBootApplication
@EnableTurbine
public class EurekaTurbineApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaTurbineApplication.class, args);
    }
}
