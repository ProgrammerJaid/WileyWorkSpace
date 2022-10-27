package com.wiley_spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestingClass {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new 
				ClassPathXmlApplicationContext("beans1.xml");
		
		Employee e1 = (Employee) appContext.getBean("emp12");
		System.out.println(e1);
		
		((ConfigurableApplicationContext)appContext).close();
	}
	
}
