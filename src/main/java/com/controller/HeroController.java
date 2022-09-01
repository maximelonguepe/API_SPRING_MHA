package com.controller;

import com.entities.AgenciesEntity;
import com.entities.HeroesEntity;
import com.metier.Hero;
import com.services.HeroesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;

@RestController()
@RequestMapping("heroes")
public class HeroController {
    @Autowired
    HeroesService heroesService;

    ///////////CREATE//////////
    @PostMapping(path = "")
    ResponseEntity<HeroesEntity> saveOrUpdate(@RequestBody HeroesEntity heroEntity) {
        HeroesEntity hero;
        try {
            hero= heroesService.save(heroEntity);

        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }
        return new ResponseEntity<>(hero,HttpStatus.OK);
    }

    ///////////READ//////////
    @GetMapping("")
    public List<HeroesEntity> getHeroes() {
        return heroesService.findAll();
    }

    @GetMapping("get")
    public ResponseEntity<HeroesEntity> getHeroByIdOrName(@PathParam("id") Integer id, @PathParam("name") String name) {
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


    @GetMapping("find")
    public List<HeroesEntity> findByHeroName(@PathParam("name") String name){
        return heroesService.findByName(name);
    }

    ///////////DELETE//////////
    @DeleteMapping("")
    ResponseEntity<String> delete(@RequestBody HeroesEntity heroesEntity) {
        try {
            heroesService.delete(heroesEntity);
        } catch (Exception e) {
            return new ResponseEntity<>("Impossible to delete the agency, heroes are still associated with it", HttpStatus.CONFLICT);
        }
        return new ResponseEntity<>("The deletion has been made", HttpStatus.OK);
    }




}
