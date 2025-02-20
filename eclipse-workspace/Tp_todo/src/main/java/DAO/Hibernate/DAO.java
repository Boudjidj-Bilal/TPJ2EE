package DAO.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


import java.util.List;

// Hibernate :
public abstract class DAO<T> {

    protected SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    public abstract boolean create(T obj);

    public abstract boolean delete(T obj);

    public abstract boolean update(T obj);

    public abstract T find(int id);

    public abstract List<T> list();

    protected Session getSession() {
        return sessionFactory.openSession();
    }



}