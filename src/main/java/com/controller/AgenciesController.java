package com.controller;


import com.entities.AgenciesEntity;
import com.services.AgenciesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController()
@RequestMapping("agencies")
public class AgenciesController {
    @Autowired
    AgenciesService agenciesService;


    @GetMapping()
    public List<AgenciesEntity> getAgencies() {
        return agenciesService.findAll();
    }

    @GetMapping(path = "get")
    ResponseEntity<AgenciesEntity> getAgencyByIdOrName(@PathParam("id") Integer id, @PathParam("name") String name) {
        if (id != null) {
            AgenciesEntity agenciesEntity = agenciesService.getById(id);
            if (agenciesEntity != null) {
                return new ResponseEntity<>(agenciesEntity, HttpStatus.OK);

            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);

            }
        } else if (name != null) {
            AgenciesEntity agenciesEntity = agenciesService.getByName(name);
            if (agenciesEntity != null) {
                return new ResponseEntity<>(agenciesEntity, HttpStatus.OK);

            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);

            }
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @DeleteMapping(path = "")
    ResponseEntity<String> deleteAgencyByIdOrName(@PathParam("id") Integer id, @PathParam("name") String name) {
        if (id != null) {
            agenciesService.deleteById(id);

            return new ResponseEntity<>("Successfully deleted", HttpStatus.OK);


        } else if (name != null) {
            agenciesService.deleteByName(name);
            return new ResponseEntity<>("Successfully deleted", HttpStatus.OK);


        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @PostMapping(path = "")
    ResponseEntity<AgenciesEntity> save(@RequestBody AgenciesEntity agenciesEntity){
        AgenciesEntity agencies;
        try {
            agencies=agenciesService.save(agenciesEntity);

        }
        catch (Exception e){
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }

       return new ResponseEntity<>(agencies,HttpStatus.OK);
    }



}
