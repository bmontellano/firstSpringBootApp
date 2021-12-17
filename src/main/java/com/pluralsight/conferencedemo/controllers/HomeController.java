package com.pluralsight.conferencedemo.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @Value("${app.version}")
    private String appVersion;

    @GetMapping("/")
    public Map<String, String> getStatus() {
         Map<String, String> newMap = new HashMap<>();
         newMap.put("app-version", appVersion);
         return newMap;
    }
    
}
