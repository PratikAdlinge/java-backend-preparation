package com.first_cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.Employee;

public class Second_Level_Cache {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		
		Session session=factory.openSession();
		Employee emp=session.get(Employee.class, 12);
		System.out.println(emp);
		session.close();
		
		Session session2=factory.openSession();
		Employee emp2=session.get(Employee.class, 12);
		System.out.println(emp2);
		session2.close();
		factory.close();

	}

}
