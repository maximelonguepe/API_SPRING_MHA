package com.controller;

import com.entities.HeroesEntity;
import com.entities.SchoolEntity;
import com.services.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class SchoolController {
    @Autowired
    private SchoolService schoolService;

    ////////READ
    @GetMapping
    public List<SchoolEntity> findAll(){
        return schoolService.findAll();
    }

    @GetMapping("get")
    public ResponseEntity<SchoolEntity> findByName(@PathParam("id") Integer id, @PathParam("name") String name){
        if (id != null) {
            SchoolEntity school = schoolService.findById(id);
            if (school != null) {
                return new ResponseEntity<>(school, HttpStatus.OK);

            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);

            }
        } else if (name != null) {
            SchoolEntity school = schoolService.findByName(name);
            if (school != null) {
                return new ResponseEntity<>(school, HttpStatus.OK);

            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);

            }
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
}
