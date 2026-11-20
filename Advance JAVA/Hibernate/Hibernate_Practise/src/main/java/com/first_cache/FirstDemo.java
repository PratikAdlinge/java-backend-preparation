package com.first_cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.Employee;

public class FirstDemo {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		
		Session session=factory.openSession();
		
		Employee emp=session.get(Employee.class,12 );
		System.out.println(emp);
		Employee emp1=session.get(Employee.class,12 );
		System.out.println(emp1);
		System.out.println(session.contains(emp1));

		

	}

}
