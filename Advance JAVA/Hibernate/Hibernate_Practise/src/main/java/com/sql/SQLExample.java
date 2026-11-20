package com.sql;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

import com.hibernate.Employee;

public class SQLExample {
	@SuppressWarnings("deprecation")
	public static void main(String [] args) {
		
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		
		//SQL query 
		String q="select * from employee";
		 NativeQuery query=session.createNativeQuery(q);
		 
		 List<Object[]> list=query.list();
		 for (Object[] student : list) {
			System.out.println(Arrays.toString(student));
		}
		
		
		
		session.close();
		factory.close();
	}

}
