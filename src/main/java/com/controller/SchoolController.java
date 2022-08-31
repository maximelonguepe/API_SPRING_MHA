package com.controller;

import com.entities.SchoolEntity;
import com.services.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SchoolController {
    @Autowired
    private SchoolService schoolService;

    @GetMapping
    public List<SchoolEntity> findAll(){
        return schoolService.findAll();
    }
}
