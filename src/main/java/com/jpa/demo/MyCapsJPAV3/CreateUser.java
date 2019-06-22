package com.jpa.demo.MyCapsJPAV3;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class CreateUser {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPersistanceUnit");
		
		EntityManager manager = emf.createEntityManager();
		manager.getTransaction().begin();
		
		User u = new User();
		u.setUser_id(1);
		u.setUser_name("pinka");
		u.setUser_password("qwerty");
		
		manager.persist(u);
		manager.getTransaction().commit();
		
		
		
		
		
		
	}
}
