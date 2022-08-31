package com.controller;

import com.entities.ClassesEntity;
import com.services.ClassesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("classes")
public class ClassesController {
    @Autowired
    private ClassesService classesService;


    @GetMapping("")
    public List<ClassesEntity> findAll() {
        return classesService.findAll();
    }


}
