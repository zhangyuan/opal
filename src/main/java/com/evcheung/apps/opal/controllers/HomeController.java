package com.evcheung.apps.opal.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ConfigurationProperties(locations = "classpath:application.properties")
public class HomeController {
    @Value("${environment}")
    private String environment;

    @RequestMapping("/")
    public String index() {
        return "Hello Spring World!";
    }

    @RequestMapping("/info")
    public String info() {
        return environment;
    }

}
