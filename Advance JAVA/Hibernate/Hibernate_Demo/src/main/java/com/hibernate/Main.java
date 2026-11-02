package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student s=new Student();
        s.setSid(103);
        s.setSname("pratibha");
        s.setTech("Gen AI");

//        Configuration config=new Configuration();
//        config.addAnnotatedClass(com.hibernate.Student.class);
//        config.configure();
        SessionFactory factory=new Configuration().addAnnotatedClass(com.hibernate.Student.class).configure().buildSessionFactory();

        Session session=factory.openSession();

        Transaction transaction=session.beginTransaction();
        session.persist(s);

        transaction.commit();
    }
}