package com.onetomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class One_To_Many_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Question q1 = new Question();
		Answer ans = new Answer();

		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory factory = config.buildSessionFactory();

		q1.setQuestion_Id(111);
		q1.setQuestion("What is java?");

		// answer
		ans.setAnswer_Id(101);
		ans.setAnswer("java is a programming language");
		ans.setQuestion(q1);

		Answer ans1 = new Answer();
		ans1.setAnswer_Id(102);
		ans1.setAnswer("java is oop language");
		ans1.setQuestion(q1);

		Answer ans2 = new Answer();
		ans2.setAnswer_Id(103);
		ans2.setAnswer("java has different framework");
		ans2.setQuestion(q1);

		List<Answer> list = new ArrayList<Answer>();
		list.add(ans);
		list.add(ans1);
		list.add(ans2);
		q1.setAnswer(list);
		Session session = factory.openSession();

		

		Transaction transaction = session.beginTransaction();
		session.persist(q1);
		session.persist(ans);
		session.persist(ans1);
		session.persist(ans2);
		session.persist(ans);

		transaction.commit();
		Question q = session.get(Question.class, 111);

		System.out.println(q.getQuestion_Id());
		System.out.println(q.getQuestion());
		System.out.println(q.getAnswer().size());
		session.close();
		factory.close();

	}

}
