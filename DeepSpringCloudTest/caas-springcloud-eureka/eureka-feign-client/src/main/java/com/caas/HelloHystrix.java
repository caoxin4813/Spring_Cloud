package com.caas;

/**
 * Created by caoxin on 2018/3/30.
 */
public class HelloHystrix implements EurekaClientFeign {
    @Override
    public String sayHiFromClientEureka(String name) {
        return "Hello,"+name+",sorry,error!";
    }
}
