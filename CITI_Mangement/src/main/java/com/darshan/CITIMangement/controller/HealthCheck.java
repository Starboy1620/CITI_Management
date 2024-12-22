package com.darshan.CITIMangement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {

    @GetMapping("/health-Check")
    public String healthCheck(){
        return "Perfect";
    }

}
