package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("refconfig.xml");
		
		A a=(A) context.getBean("aref");
		System.out.println(a.getob());
		
		System.out.println(a.getob().getY());

	}

}
