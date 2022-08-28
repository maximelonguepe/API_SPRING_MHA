package com.services;


import com.entities.HeroesEntity;
import com.repository.HeroesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;

@Service
public class HeroesService {
    @Autowired
    HeroesRepository heroesRepository;

    @Autowired
    EntityManager entityManager;

    public List<HeroesEntity> findAll(){
        return  heroesRepository.findAll();
    }

    public HeroesEntity getById(Integer id){
        if(heroesRepository.findById(id).isPresent()){
            return heroesRepository.findById(id).get();
        }
        return null;
    }

    public HeroesEntity getByName(String name){
        return heroesRepository.findByHeroName(name);
    }
}
