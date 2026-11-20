package com.cascade;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.onetomany.Answer;
import com.onetomany.Question;

public class CascadeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		
		Question q1=new Question();
		q1.setQuestion_Id(21);
		q1.setQuestion("What Is Hibernate");
		
		Answer a1=new Answer(1132,"Hibernate is ORM framework");
		Answer a2=new Answer(1121,"Hibernate has HQl Language");
		Answer a3=new Answer(1125,"Hibernate is auto generates table ");
		
		List<Answer>list=new ArrayList<Answer>();
		list.add(a1);
		list.add(a2);
		list.add(a3);
		
		Transaction transaction=session.beginTransaction();
		q1.setAnswer(list);
		session.persist(q1);
		transaction.commit();
		session.close();
		factory.close();
		

		
		

	}

}
