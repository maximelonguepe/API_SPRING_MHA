package com.services;

import com.entities.ClassesEntity;
import com.repository.ClassesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassesService {
    @Autowired
    private ClassesRepository classesRepository;

    public List<ClassesEntity> findAll(){
        return classesRepository.findAll();
    }


}
