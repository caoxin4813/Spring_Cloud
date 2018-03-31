package com.caas;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by caoxin on 2018/3/30.
 */
@FeignClient(value = "eureka-client", configuration = FeignConfig.class, fallback = HelloHystrix.class)
public interface EurekaClientFeign {
    @GetMapping(value = "/client")
    String sayHiFromClientEureka(@RequestParam(value = "name") String name);
}
