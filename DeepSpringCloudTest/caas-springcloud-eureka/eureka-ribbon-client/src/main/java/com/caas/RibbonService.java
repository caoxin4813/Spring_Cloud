package com.caas;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by caoxin on 2018/3/29.
 */
@Service
public class RibbonService {
    @Autowired
    RestTemplate restTemplate;
    @HystrixCommand(fallbackMethod = "helloError")
    public String clientHello(String name) {
        return restTemplate.getForObject("http://eureka-client/client?name="+name, String.class);
    }
    public String helloError(String name) {
        return "Hello,"+name+",sorry,error!";
    }
}
