package com.ust_cicd_app.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyApi {
    @GetMapping
    public String hello(){
        return  "Hello  World welcome to ust";
    }

}
