package com.controller;

import com.metier.Hero;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class HeroController {

    @GetMapping("heroes")
    public Hero getHeroes(){
        return new Hero("Midoriya","Izuku","Deku");

    }
}
