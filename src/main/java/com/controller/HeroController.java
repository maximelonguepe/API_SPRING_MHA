package com.controller;

import com.entities.HeroesEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController()
public class HeroController {

    @GetMapping("heroes")
    public List<HeroesEntity> getHeroes(){
        return new ArrayList<>();

    }
}
