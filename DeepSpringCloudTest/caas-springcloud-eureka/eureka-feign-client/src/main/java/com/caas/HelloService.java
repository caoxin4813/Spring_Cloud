package com.caas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by caoxin on 2018/3/30.
 */
@Service
public class HelloService {
    @Autowired
    EurekaClientFeign eurekaClientFeign;
    public String sayHello(String name) {
        return eurekaClientFeign.sayHiFromClientEureka(name);
    }
}
