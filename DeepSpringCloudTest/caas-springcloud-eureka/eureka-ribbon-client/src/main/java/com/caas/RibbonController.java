package com.caas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by caoxin on 2018/3/29.
 */
@RestController
public class RibbonController {
    @Autowired
    RibbonService ribbonService;
    @GetMapping("/client")
    public String hello(@RequestParam(required = false,defaultValue = "caoxin") String name) {
        return ribbonService.clientHello(name);
    }
}
