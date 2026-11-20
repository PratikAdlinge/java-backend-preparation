package com.hql;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.hibernate.Employee;

public class HQLExample {
	public static void main(String args[]) {
		
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		Employee emp=new Employee();
		
//		String query="from Employee where city='Kharadi'";
		String query="from Employee where city=:x";

		Query q=session.createQuery(query);
		q.setParameter("x","Kharadi");
		List<Employee>list=q.list();
		System.out.println("Total records: " + list.size());
		for(Employee e:list) {
			System.out.println(e.getName()+":"+e.getTech().getTechnology());
		}
		System.out.println("------------------------------");
		//delete
		Transaction transaction=session.beginTransaction();
//		String query2="delete from Employee where city=:c";
//		Query q2=session.createQuery(query2);
//		q2.setParameter("c", "Magarpatta");
//		//List<Employee>list2=q2.list();
//		int rows=q2.executeUpdate();
//		System.out.println("deleted");
//		System.out.println(rows);
		
		//update
		Query q2=session.createQuery("update Employee set city=:c where city=:a");
		q2.setParameter("c","Shivajinagar");
		q2.setParameter("a", "Kharadi");
		int r=q2.executeUpdate();
		System.out.println(r+"rows updated");
		
		//how to execute join query
		
		Query q3=session.createQuery("select q.question ,q.question_Id,a.answer from Question as q INNER JOIN q.answer as a");
		List<Object[]> list3=q3.getResultList();
		for (Object[] objects : list3) {
			System.out.println(Arrays.toString(objects));
		}
		
		
		
		transaction.commit();
		session.close();	
		factory.close();
	}

}
