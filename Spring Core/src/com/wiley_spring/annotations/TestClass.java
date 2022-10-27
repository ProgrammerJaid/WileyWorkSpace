package com.wiley_spring.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {
	
	public static void main(String[] args) {
		ApplicationContext appContext = new
				ClassPathXmlApplicationContext("annotations.xml");
		
		Customer c = (Customer) appContext.getBean("cust");
		System.out.println(c);
		
		CustomerDAO dao = (CustomerDAO) appContext.getBean("customerDAOImpl");
		
		int rows=dao.addCustomer(c);
		if(rows>0)
			System.out.println("Record inserted successfully");
		else
			System.out.println("Record not inserted");
		
		((AbstractApplicationContext) appContext).close();
	}
	
}
