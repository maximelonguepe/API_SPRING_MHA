package com.controller;

import com.metier.Hero;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiSpringMhaApplicationController {

    @RequestMapping
    public String helloWorld(){
        return "My hero academia API";
    }

    @RequestMapping("goodbye")
    public String goodbye(){
        return "Goodbye";
    }



}
