package com.cisco.blogger.data;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cisco.blogger.api.User;

public class UserDAOImpl implements UserDAO {

	static  EntityManager em;
	
	public UserDAOImpl() {
		if(null == em) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("blogger");
		em = factory.createEntityManager();
		}
	}
				
	public void create(User user) {
		em.getTransaction().begin();
		em.persist(user);
		em.getTransaction().commit();
		System.out.println("User registered");
	}

	public User findUser(String emailId){
		User result = (User) em.find(User.class,emailId);
		return result;
	}
	
	public void updateUser(User user) {
		em.getTransaction().begin();
	    em.merge(user);
	   	em.getTransaction().commit();
	}

	public User validateUser(String emailId, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
