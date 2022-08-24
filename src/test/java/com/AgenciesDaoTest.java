package com;


import com.entities.AgenciesEntity;
import org.assertj.core.api.Assertions;


import org.hibernate.exception.ConstraintViolationException;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.nio.charset.StandardCharsets;
import java.util.Random;

@SpringBootTest
public class AgenciesDaoTest {
/*
    @Test
    public void testCreate(){
        AgenciesDao agenciesDao=new AgenciesDao();
        byte[] array = new byte[35]; // length is bounded by 7
        new Random().nextBytes(array);
        String generatedString = new String(array, StandardCharsets.UTF_8);
        AgenciesEntity agenciesEntity=new AgenciesEntity(generatedString);
        Integer response=agenciesDao.create(agenciesEntity);

    }

    @Test(expected = ConstraintViolationException.class)
    public void testCreateSameNameKO(){
        AgenciesDao agenciesDao=new AgenciesDao();
        AgenciesEntity agenciesEntity = new AgenciesEntity("test");
        AgenciesEntity agenciesEntity2 = new AgenciesEntity("test");
        agenciesDao.create(agenciesEntity);
        agenciesDao.create(agenciesEntity2);

    }
    @Test
    public void testCreateSameId(){
        AgenciesDao agenciesDao=new AgenciesDao();
        AgenciesEntity agenciesEntity = new AgenciesEntity(1,"test");
        AgenciesEntity agenciesEntity2 = new AgenciesEntity(1,"test");
        agenciesDao.create(agenciesEntity);
        agenciesDao.create(agenciesEntity2);
        agenciesDao.delete(agenciesEntity);
        agenciesDao.delete(agenciesEntity2);
    }
    @Test
    public void testFindOK(){
        AgenciesDao agenciesDao=new AgenciesDao();
        AgenciesEntity agenciesEntity=agenciesDao.getById(1);
        Assertions.assertThat(agenciesEntity).isNotNull();
    }
    @Test
    public void testFindKO(){
        AgenciesDao agenciesDao=new AgenciesDao();
        AgenciesEntity agenciesEntity=agenciesDao.getById(-100);
        Assertions.assertThat(agenciesEntity).isNull();
    }


*/


}
