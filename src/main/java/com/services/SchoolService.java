package com.services;

import com.entities.SchoolEntity;
import com.repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SchoolService {
    @Autowired
    private SchoolRepository schoolRepository;

    public List<SchoolEntity> findAll(){
        return schoolRepository.findAll();
    }

    public SchoolEntity findByName(String name){
        return schoolRepository.findByName(name);
    }

    public SchoolEntity findById(Integer id){
        Optional<SchoolEntity> schoolEntity=schoolRepository.findById(id);
        return schoolEntity.orElse(null);
    }
    
}
