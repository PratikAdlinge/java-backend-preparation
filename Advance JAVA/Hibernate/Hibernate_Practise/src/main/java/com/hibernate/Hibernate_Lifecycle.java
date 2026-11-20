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
		
		Employee emp1=new Employee();
		Employee emp2=new Employee();
		Employee emp3=new Employee();
		Employee emp4=new Employee();
		Employee emp5=new Employee();

		
		emp1.setId(11);
		emp1.setName("Mayur");
		emp1.setCity("Hinjewadi");
		emp1.setTech(new Technology("cloud Infra Engineer ","4 years"));
		
		emp2.setId(12);
		emp2.setName("Sandesh");
		emp2.setCity("Kharadi");
		emp2.setTech(new Technology("cloud Support Engineer ","2.5 years"));
		
		emp3.setId(13);
		emp3.setName("Aditya");
		emp3.setCity("VimanNagar");
		emp3.setTech(new Technology("Fullstack Developer ","3.5years"));
		
		emp4.setId(14);
		emp4.setName("Ajit");
		emp4.setCity("Kharadi");
		emp4.setTech(new Technology("Dot.net Developer ","4.5 years"));
		
		emp5.setId(15);
		emp5.setName("Rohan ");
		emp5.setCity("MagarPatta");
		emp5.setTech(new Technology("AI/ML Engineer ","2 years"));
		//Employee : Transient 
		
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		
		session.persist(emp1);
		session.persist(emp2);
		session.persist(emp3);
		session.persist(emp4);
		session.persist(emp5);

		//emp.setName("Mayur Khalage");
		//Employee : Persistent  -session,database
		
		
		transaction.commit();
		session.close();
		
		//Employee : Detached :
		//emp.setName("Sachin");
		
		System.out.println(emp1);
		sessionFactory.close();
		
	}

}
