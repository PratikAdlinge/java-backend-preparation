package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//get , load
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory factory=config.buildSessionFactory();
		Session session=factory.openSession();
		Employee emp=(Employee)session.get(Employee.class, 102);
		Address add=(Address)session.find(Address.class,1);
		Address ad=(Address)session.getReference(Address.class,1);

		System.out.println(add.getStreet()+" : "+add.getCity());
		System.out.println(emp);
		System.out.println(add.getAddedDate());
		session.close();
		factory.close();
	}

}
