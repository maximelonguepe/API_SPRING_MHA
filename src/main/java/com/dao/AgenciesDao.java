package com.dao;

import com.entities.AgenciesEntity;
import org.hibernate.Session;

import java.util.List;

public class AgenciesDao extends HibernateInteractions<AgenciesEntity> {
    public List<AgenciesEntity> getAll() {
        return findAll(AgenciesEntity.class);
    }
    public AgenciesEntity getById(Integer id) {
        return (AgenciesEntity) find(id, AgenciesEntity.class);
    }
    public AgenciesEntity getByName(String name) {
        Session session = getSession();
        AgenciesEntity agenciesEntity = (AgenciesEntity) session.createQuery("from AgenciesEntity where agencyName=:name").setString("name", name).uniqueResult();
        return agenciesEntity;
    }
}
