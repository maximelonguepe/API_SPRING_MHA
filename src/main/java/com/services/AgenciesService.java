package com.services;

import com.repository.AgenciesRepository;
import com.entities.AgenciesEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

@Service
public class AgenciesService {
    @Autowired
    AgenciesRepository agenciesRepository;

    @Autowired
    EntityManager entityManager;


    public List<AgenciesEntity> findAll() {
        return agenciesRepository.findAll();
    }

    public AgenciesEntity findByName(String agencyName) {
        return agenciesRepository.findByAgencyName(agencyName);
    }

    public AgenciesEntity findById(Integer id) {
        Optional<AgenciesEntity> agenciesEntity=agenciesRepository.findById(id);
        return agenciesEntity.orElse(null);
    }

    public List<AgenciesEntity> searchByName(String agencyName){
        return agenciesRepository.searchByName(agencyName);
    };

    public AgenciesEntity save(AgenciesEntity agenciesEntity){
        return agenciesRepository.save(agenciesEntity);
    }

    @Transactional
    public void delete(AgenciesEntity agency){agenciesRepository.delete(agency);}
}
