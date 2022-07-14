package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiSpringMhaApplicationController {

    @RequestMapping
    public String helloWorld(){
        return "Hello World from Spring Boot";
    }

    @RequestMapping("goodbye")
    public String goodbye(){
        return "Goodbye";
    }
}
