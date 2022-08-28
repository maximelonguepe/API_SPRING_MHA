package com.controller;

import com.entities.HeroesEntity;
import com.services.HeroesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;

@RestController()
@RequestMapping("heroes")
public class HeroController {
    @Autowired
    HeroesService heroesService;

    @GetMapping("")
    public List<HeroesEntity> getHeroes() {
        return heroesService.findAll();
    }

    @GetMapping("get")
    public ResponseEntity<HeroesEntity> getHeroByIdOrName(@PathParam("id") Integer id, @PathParam("name") String name){
        if (id != null) {
            HeroesEntity hero = heroesService.getById(id);
            if (hero != null) {
                return new ResponseEntity<>(hero, HttpStatus.OK);

            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);

            }
        } else if (name != null) {
            HeroesEntity hero = heroesService.getByName(name);
            if (hero != null) {
                return new ResponseEntity<>(hero, HttpStatus.OK);

            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);

            }
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }



}
