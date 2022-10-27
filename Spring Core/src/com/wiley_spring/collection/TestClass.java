package com.wiley_spring.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new 
				ClassPathXmlApplicationContext("customer.xml");
		
//		Customer bean = (Customer) appContext.getBean("cust1");
//		System.out.println(bean);
//		
//		CustomerSet set = (CustomerSet) appContext.getBean("custlist");
//		System.out.println(set);
//		
//		CustomerMap map = (CustomerMap) appContext.getBean("custmap");
//		System.out.println(map);
		
		Customer c = (Customer) appContext.getBean("single");
		System.out.println(c.hashCode());
		
		Customer c2 = (Customer) appContext.getBean("multiple");
		System.out.println(c2.hashCode());
		
		
		((ConfigurableApplicationContext)appContext).close();
		
	}
	
}
