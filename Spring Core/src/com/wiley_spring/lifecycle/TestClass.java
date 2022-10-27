package com.wiley_spring.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {

	public static void main(String[] args) {
		
		ApplicationContext context = new 
				ClassPathXmlApplicationContext("lifecycle.xml");
		
		LifeCycle bean = (LifeCycle) context.getBean("life");
		System.out.println(bean);
		
		(((AbstractApplicationContext) context)).close();
		
	}
	
}
