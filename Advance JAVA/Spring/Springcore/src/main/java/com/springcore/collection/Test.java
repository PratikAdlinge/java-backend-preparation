package com.springcore.collection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ap=new ClassPathXmlApplicationContext("CollectionConfig.xml");
		Employee e1=(Employee) ap.getBean("emp1");
		System.out.println(e1);
		
		
		
		

	}

}
