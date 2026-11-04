package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbeddedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory factory=config.buildSessionFactory();
		Session session=factory.openSession();
		
		Employee emp =new Employee();
		Technology tech=new Technology();
		
		emp.setId(1001);
		emp.setName("omkar");
		emp.setCity("chichwad");
		tech.setTechnology("Robotics");
		tech.setExperience("2 years 2 months");
		emp.setTech(tech);
		
		Employee emp1 =new Employee();
		Technology tech1=new Technology();
		
		emp1.setId(1002);
		emp1.setName("Amol");
		emp1.setCity("Baner");
		tech1.setTechnology("Devops");
		tech1.setExperience("4 years 2 months");
		emp1.setTech(tech1);
		Transaction transaction =session.beginTransaction();
		session.persist(emp);
		session.persist(emp1);
		
		transaction.commit();
		
		session.close();

	}

}
