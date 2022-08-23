package com.dao;

import java.util.List;

public interface CrudOperations<T> {

    public int create(T obj);

    public T find(Integer id, Class<T> tClass);

    public List<T> findAll(Class<T> tClass);

    public boolean update(T obj);

    public boolean delete(T obj);

    public boolean deleteAll(Class<T> tClass);

    public void close();
}
