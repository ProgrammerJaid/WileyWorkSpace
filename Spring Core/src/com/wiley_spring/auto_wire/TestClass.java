package com.wiley_spring.auto_wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {

	public static void main(String[] args) {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("autowiring.xml");

		Employee bean = (Employee) appContext.getBean("emp"); //byType
		System.out.println(bean);
		
		Employee bean1 = (Employee) appContext.getBean("emp1");//this is byName
		System.out.println(bean1);
		
		((AbstractApplicationContext) appContext).close();

	}

}
