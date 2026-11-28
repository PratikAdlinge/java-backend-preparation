package com.springcore.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/standalone/collection/standaloneconfig.xml");
		Person person1=(Person) context.getBean("person1");
		Person person2=(Person) context.getBean("person2");
		System.out.println(person1);
		System.out.println(person2);
		System.out.println(person1.getFriends().getClass().getName());
		
		Person p1=(Person) context.getBean("person3");
		System.out.println(p1.getFees());  
	
	}

}
