package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Hibernate_Lifecycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//practical of hibernate Object States:
		//Transient
		//Persistent
		//Detached
		//Removed
		
		System.out.println("Example:");
		
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		// Creating Employee Object
		
		Employee emp=new Employee();
		
		emp.setId(11);
		emp.setName("Mayur");
		emp.setCity("Pune");
		emp.setTech(new Technology("cloud Infra Engineer ","4 years"));
		//Employee : Transient 
		
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		
		session.persist(emp);
		emp.setName("Mayur Khalage");
		//Employee : Persistent  -session,database
		
		
		transaction.commit();
		session.close();
		
		//Employee : Detached :
		emp.setName("Sachin");
		
		System.out.println(emp);
		sessionFactory.close();

	}

}
