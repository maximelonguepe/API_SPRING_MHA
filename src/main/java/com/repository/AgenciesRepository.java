package com.repository;

import com.entities.AgenciesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface AgenciesRepository extends JpaRepository<AgenciesEntity,Integer> {
    @Query("select a from AgenciesEntity a where a.agencyName = :agencyName")
    AgenciesEntity findByAgencyName(@Param("agencyName") String agencyName);

    @Modifying
    @Query("delete from AgenciesEntity a where a.agencyName = :agencyName")
    void deleteByAgencyName(@Param("agencyName") String agencyName);

}
