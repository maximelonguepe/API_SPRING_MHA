package com.repository;

import com.entities.SchoolEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface SchoolRepository extends JpaRepository<SchoolEntity,Integer> {
    @Query("select s from SchoolEntity s where s.schoolName=:schoolName")
    SchoolEntity findByName(@Param("schoolName") String schoolName);


}
