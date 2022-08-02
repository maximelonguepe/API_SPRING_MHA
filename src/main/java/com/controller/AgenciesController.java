package com.controller;

import com.Dao.AgenciesDao;
import com.entities.AgenciesEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("agencies")
public class AgenciesController {
    @GetMapping()
    public List<AgenciesEntity> getAgencies(){
        AgenciesDao agenciesDao =new AgenciesDao();
        return agenciesDao.getAll();
    }
}
