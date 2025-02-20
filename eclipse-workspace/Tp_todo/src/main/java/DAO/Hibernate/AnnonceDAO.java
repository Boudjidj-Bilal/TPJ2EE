package DAO.Hibernate;

import model.Annonce;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

// Hibernate :
public class AnnonceDAO extends DAO {

    @Override
    public boolean create(Object obj) {
        Transaction transaction = null;
        try {
            Session session = getSession();
            transaction = session.beginTransaction();
            session.persist(obj);
            transaction.commit();
            return true;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean delete(Object obj) {
        Transaction transaction = null;
        try {
            Session session = getSession();
            transaction = session.beginTransaction();
            session.delete(obj);
            transaction.commit();
            return true;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean update(Object obj) {
        Transaction transaction = null;
        try  {
            Session session = getSession();
            transaction = session.beginTransaction();
            session.merge(obj);
            transaction.commit();
            return true;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Annonce find(int id) {
        try {
            Session session = getSession();
            return (Annonce) session.get(Annonce.class, id);
        }catch (Exception e) {

        }
        return null;
    }

    @Override
    public List list() {
        try {
            Session session = getSession();
            return session.createQuery("from Annonce").list();
        } catch (Exception e){}
        return null;
    }
}
