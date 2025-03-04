package com.vineeth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping
    public  String HomeControllerHandler(){
        return "Hello Vineeth Begin Microservice Project for Saloon booking system";
    }
}
