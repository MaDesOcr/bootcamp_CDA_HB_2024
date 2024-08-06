package test.test.dao;


import test.test.entity.User;
import test.test.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class UserDao {

    public void saveUser(User user) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.persist(user);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public User getUserById(Long id) {
    	try(Session session = HibernateUtil.getSessionFactory().openSession()){
    		User userToDelete = session.get(User.class, id);
    		return userToDelete;
    	}
    }
    
    public List<User> getUsers() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
        	List<User> list = session.createQuery("FROM User", User.class).list();
            return list;
        }
    }
    
    public void deleteUser(Long id) {
    	Transaction transaction = null;
    	try(Session session = HibernateUtil.getSessionFactory().openSession()){
    		transaction =  session.beginTransaction();
    		User userToDelete = session.get(User.class, id);
    		if(userToDelete != null) {
        		session.remove(userToDelete);    			
    		}
    		transaction.commit();
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    }
    
    public void updateUser(User user) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.update(user);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

}