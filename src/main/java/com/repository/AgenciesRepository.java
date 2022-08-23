package com.repository;

import com.entities.AgenciesEntity;
import org.springframework.data.jpa.repository.JpaRepository;



public interface AgenciesRepository extends JpaRepository<AgenciesEntity,Integer> {

}
