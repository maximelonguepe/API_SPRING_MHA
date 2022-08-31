package com.services;

import com.entities.SchoolEntity;
import com.repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolService {
    @Autowired
    private SchoolRepository schoolRepository;

    public List<SchoolEntity> findAll(){
        return schoolRepository.findAll();
    }

}
