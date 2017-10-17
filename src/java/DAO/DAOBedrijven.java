/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import DAL.Bedrijven;
import DAL.NewHibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author yvex
 */
public class DAOBedrijven {
   public void addUsers(Bedrijven user) {
        Transaction trns = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            session.save(user);
            session.getTransaction().commit();
        } catch (RuntimeException e) {
            if (trns != null) {
                trns.rollback();
            }
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
    }
 public List<Bedrijven> getAllUserss() {
//        System.out.println("start method all users in dao"); 
        List<Bedrijven> users = new ArrayList<>();
        
        Transaction trns = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            users = session.createQuery("from Bedrijven").list();
            System.out.println("users querried en lengte = " + users.size());
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        System.out.println("size in dao = " + users.size());
        return users;}
 
 
 
    public void deleteUsers(int userid) {
        Transaction trns = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            Bedrijven user = (Bedrijven) session.load(Bedrijven.class, new Integer(userid));
            session.delete(user);
            session.getTransaction().commit();
        } catch (RuntimeException e) {
            if (trns != null) {
                trns.rollback();
            }
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
    }

    public void updateUsers(Bedrijven user) {
        Transaction trns = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            session.update(user);
            session.getTransaction().commit();
        } catch (RuntimeException e) {
            if (trns != null) {
                trns.rollback();
            }
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
    }

    

    public Bedrijven getUsersById(int userid) {
        Bedrijven user = null;
        Transaction trns = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            String queryString = "from Users where id = :id";
            Query query = session.createQuery(queryString);
            query.setInteger("id", userid);
            user = (Bedrijven) query.uniqueResult();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return user;
    } 
}
