package com.repository;

import com.entities.AgenciesEntity;
import com.entities.HeroesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface HeroesRepository extends JpaRepository<HeroesEntity,Integer> {
    @Query("select h from HeroesEntity h where h.heroName = :heroName")
    HeroesEntity findByHeroName(@Param("heroName") String heroName);
}
