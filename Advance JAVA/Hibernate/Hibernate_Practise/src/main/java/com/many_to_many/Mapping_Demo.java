package com.many_to_many;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;		

public class Mapping_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Configuration config=new Configuration();
		config.configure();
		SessionFactory factory=config.buildSessionFactory();
		
		Employees emp1=new Employees();
		Employees emp2=new Employees();
		
		emp1.setEmp_Id(11011);
		emp1.setEmp_Name("Pratik");
		
	
		emp2.setEmp_Id(11022);
		emp2.setEmp_Name("nishant");
		
		Projects p1=new Projects();
		Projects p2=new Projects();
		
		p1.setProject_Id(0011);
		p1.setProject_Name("Esport Management");
		
		p2.setProject_Id(0022);
		p2.setProject_Name("Traffic Detection thorugh IOT");
		
		List<Employees> list1=new ArrayList<Employees>();
		List<Projects> list2=new ArrayList<Projects>();
		
		list1.add(emp1);
		list1.add(emp2);
		
		list2.add(p1);
		list2.add(p2);
		
		emp1.setProject(list2);
		emp2.setProject(list2);
		p1.setEmp(list1);
		p2.setEmp(list1);
		
		
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.persist(emp1);
		session.persist(emp2);
		session.persist(p1);
		session.persist(p2);
		transaction.commit();
		session.close();
		factory.close();
	}

}
