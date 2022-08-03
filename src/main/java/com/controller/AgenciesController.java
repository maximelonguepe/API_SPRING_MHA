package com.controller;

import com.Dao.AgenciesDao;
import com.entities.AgenciesEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController()
@RequestMapping("agencies")
public class AgenciesController {
    @GetMapping()
    public List<AgenciesEntity> getAgencies() {
        AgenciesDao agenciesDao = new AgenciesDao();
        return agenciesDao.getAll();
    }

    @GetMapping(path = "get")
    ResponseEntity<AgenciesEntity> getPersonsByName(@PathParam("id") Integer id, @PathParam("name") String name) {
        AgenciesDao agenciesDao = new AgenciesDao();
        if (id != null) {
            AgenciesEntity agenciesEntity = agenciesDao.getById(id);
            if(agenciesEntity !=null){
                return new ResponseEntity<>(agenciesEntity, HttpStatus.OK);

            }
            else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);

            }
        } else if (name != null) {
            AgenciesEntity agenciesEntity = agenciesDao.getByName(name);
            if(agenciesEntity !=null){
                return new ResponseEntity<>(agenciesEntity, HttpStatus.OK);

            }
            else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);

            }
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

}
