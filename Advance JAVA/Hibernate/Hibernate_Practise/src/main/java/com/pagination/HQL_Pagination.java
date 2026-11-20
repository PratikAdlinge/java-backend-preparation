package com.pagination;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Session.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.hibernate.Employee;

public class HQL_Pagination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		
		Query q=session.createQuery("from Employee ");
		//implementing pagination

		q.setFirstResult(0);
		
		q.setMaxResults(2);
		
		List<Employee>list=q.list();
		
		for (Employee employee : list) {
			System.out.println(employee.getName()+" : "+employee.getTech().getTechnology());
		}
		
		
		
		
		session.close();
		factory.close();

	}

}
