package com.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration config=new Configuration();
		config.configure();
		SessionFactory factory=config.buildSessionFactory();
		
		//creating obj of question 
		
		Question q1=new Question();
		q1.setQuestion_Id(1111);
		q1.setQuestion("What is Java ?");
		
		//creating obj of answer 
		
		Answer answer1=new Answer();
		
		answer1.setAnswer_Id(101);
		answer1.setAnswer("Java is Programming language.");
		answer1.setQuestion(q1);
		
		q1.setAnswer(answer1);
		
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		
		session.persist(q1);
		session.persist(answer1);
		transaction.commit();

		session.close();
		
		factory.close();
		
		
		
		

	}

}
