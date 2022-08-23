package com.services;

import com.repository.AgenciesRepository;
import com.entities.AgenciesEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;

@Service
public class AgenciesServices {
    @Autowired
    AgenciesRepository agenciesRepository;

    @Autowired
    EntityManager entityManager;
    public List<AgenciesEntity> findAll(){
        return agenciesRepository.findAll();
    }

}
