package com.wiley_spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new 
				ClassPathXmlApplicationContext("beans.xml");
		
//		Employee e = (Employee) appContext.getBean("emp1");
//		System.out.println(e);
//		
//		Employee e1 = (Employee) appContext.getBean("emp2");
//		System.out.println(e1);
		
		Employee e2 = (Employee) appContext.getBean("empConst1");
		System.out.println(e2);
		
//		Employee e3 = (Employee) appContext.getBean("empConst2");
//		System.out.println(e3);
		
		((ConfigurableApplicationContext)appContext).close();
	}
	
}
