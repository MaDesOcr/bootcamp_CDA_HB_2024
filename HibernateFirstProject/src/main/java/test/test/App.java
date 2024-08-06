package test.test;

import test.test.dao.UserDao;
import test.test.entity.Adresse;
import test.test.entity.User;

public class App {
    public static void main(String[] args) {
        
    	UserDao userDao = new UserDao();
    	User user = new User("John Doe");
    	//user.setId(-1L);
    	Adresse a1 = new Adresse();
    	user.getAdresses().add(a1);
    	a1.setUser(user);
        userDao.saveUser(user);
        
        
        
        
    //    userDao.deleteUser(1L);
        
    /*    User userToUpdate = userDao.getUserById(2L);
        userToUpdate.setNom("Jane Doe");
        userDao.updateUser(userToUpdate);
      */  
       // userDao.deleteUser(1L);
        User userToPrint = userDao.getUserById(17L);
        System.out.println(userToPrint);
    	/*
    	Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            
            User user = new User("John Doe");
            session.persist(user);
            
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }

        HibernateUtil.shutdown();*/
    }
}
