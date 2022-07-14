package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
public class ApiSpringMhaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiSpringMhaApplication.class, args);
    }
}
