package com.caas;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by caoxin on 2018/3/30.
 */
@Service
public class HelloService {
    @Autowired
    EurekaClientFeign eurekaClientFeign;
    @HystrixCommand(fallbackMethod = "HelloError")
    public String sayHello(String name) {
        return eurekaClientFeign.sayHiFromClientEureka(name);
    }
    public String HelloError(String name) {
        return "Hello,"+name+",sorry,error!";
    }
}
