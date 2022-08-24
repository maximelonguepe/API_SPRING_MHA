package com.controller;


import com.entities.AgenciesEntity;
import com.services.AgenciesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController()
@RequestMapping("agencies")
public class AgenciesController {
    @Autowired
    AgenciesServices agenciesServices;


    @GetMapping()
    public List<AgenciesEntity> getAgencies() {
        return agenciesServices.findAll();
    }

    @GetMapping(path = "get")
    ResponseEntity<AgenciesEntity> getAgencyByIdOrName(@PathParam("id") Integer id, @PathParam("name") String name) {
        if (id != null) {
            AgenciesEntity agenciesEntity = agenciesServices.getById(id);
            if (agenciesEntity != null) {
                return new ResponseEntity<>(agenciesEntity, HttpStatus.OK);

            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);

            }
        } else if (name != null) {
            AgenciesEntity agenciesEntity = agenciesServices.getByName(name);
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
            agenciesServices.deleteById(id);

            return new ResponseEntity<>("Successfully deleted", HttpStatus.OK);


        } else if (name != null) {
            agenciesServices.deleteByName(name);
            return new ResponseEntity<>("Successfully deleted", HttpStatus.OK);


        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

}
