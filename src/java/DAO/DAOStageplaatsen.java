/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import DAL.NewHibernateUtil;
import DAL.Stageplaatsen;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author yvex
 */
public class DAOStageplaatsen {
   public void addUsers(Stageplaatsen user) {
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
   public Stageplaatsen getUsersByUname(String userid) {
        Stageplaatsen user = null;
        Transaction trns = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            String queryString = "from Users where userId = :userId";
            Query query = session.createQuery(queryString);
            query.setString("userId", userid);
            user = (Stageplaatsen) query.uniqueResult();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return user;
    } 
   
   public List<Stageplaatsen> getDetailsByname(String name) {
//        System.out.println("start method all users in dao"); 
        List<Stageplaatsen> users = new ArrayList<Stageplaatsen>();
        
        Transaction trns = null;
        
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            
            String hql =  "from Stageplaatsen where Naam = :name";
             Query query = session.createQuery(hql);
             query .setString("name", name) ;
              users= query.list();      

        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        System.out.println("size in dao = " + users.size());
        return users;
    }
   
   public List<Stageplaatsen> getFKIDUserss(int primID) {
//        System.out.println("start method all users in dao"); 
        List<Stageplaatsen> users = new ArrayList<Stageplaatsen>();
        
        Transaction trns = null;
        
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            
            String hql =  "from Stageplaatsen where BedrijvenID = :primID";
             Query query = session.createQuery(hql);
             query .setInteger("primID", primID) ;
              users= query.list();      
                    
//                    "from Stageplaatsen where id =: BedrijvenID";
//            Query query = session.createQuery(hql);
//            query.setInteger("id", primID);
//            users= query.list();
            
            
//            query.setInteger("primID", primID);
//            System.out.println("users querried en lengte = " + users.size());
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        System.out.println("size in dao = " + users.size());
        return users;
    }
   
   public List<Stageplaatsen> getAllUserss() {
//        System.out.println("start method all users in dao"); 
        List<Stageplaatsen> users = new ArrayList<Stageplaatsen>();
        
        Transaction trns = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            users = session.createQuery("from Stageplaatsen").list();
            System.out.println("users querried en lengte = " + users.size());
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        System.out.println("size in dao = " + users.size());
        return users;
    }

    public void deleteUsers(int userid) {
        Transaction trns = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            Stageplaatsen user = (Stageplaatsen) session.load(Stageplaatsen.class, new Integer(userid));
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

    public void updateUsers(Stageplaatsen user) {
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

     

    public Stageplaatsen getUsersById(int userid) {
        Stageplaatsen user = null;
        Transaction trns = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            String queryString = "from Users where id = :id";
            Query query = session.createQuery(queryString);
            query.setInteger("id", userid);
            user = (Stageplaatsen) query.uniqueResult();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return user;
    } 
}
