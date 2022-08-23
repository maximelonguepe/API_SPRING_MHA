package com.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.Serializable;
import java.util.List;

public abstract class HibernateInteractions<T> implements CrudOperations<T> {
    private static SessionFactory ourSessionFactory;
    private Session session;
    public HibernateInteractions() {
        try {
            Configuration configuration = new Configuration();
            configuration.configure();

            ourSessionFactory = configuration.buildSessionFactory();
            session=getSession();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }
    public static Session getSession() throws HibernateException {
        return ourSessionFactory.openSession();
    }

    @Override
    public int create(T obj) {
        Transaction tx = null;
        tx = session.beginTransaction();
        Serializable id = session.save(obj);
        tx.commit();
        return (int) id;
    }
    @Override
    public T find(Integer id,Class<T>tClass) {
        return session.find(tClass, id);

    }

    @Override
    public List<T> findAll(Class<T> tClass) {
        return session.createQuery("from " + tClass.getName()).getResultList();

    }

    @Override
    public boolean update(T obj) {
        Transaction tx;
        tx = session.beginTransaction();
        session.merge(obj);
        tx.commit();
        return true;
    }
    @Override
    public boolean delete(T obj) {
        Transaction tx;
        tx = session.beginTransaction();
        session.remove(obj);
        tx.commit();
        return false;
    }
    @Override
    public boolean deleteAll(Class<T> tClass) {
        Transaction tx;
        tx = session.beginTransaction();
        session.createQuery("DELETE FROM "+tClass.getName()).executeUpdate();
        tx.commit();
        return false;
    }

    @Override
    public void close() {
        session.close();
    }
}
