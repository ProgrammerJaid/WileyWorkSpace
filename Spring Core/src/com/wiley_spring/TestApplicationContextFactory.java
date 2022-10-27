package com.wiley_spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApplicationContextFactory {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new 
				ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Done.");
		
		//Application Context can work with multiple beans.xml files.
		ApplicationContext multipleContext = new
				ClassPathXmlApplicationContext(new String[]{"beans.xml","beans1.xml"});
		
		System.out.println("Multiple Done.");
		
	}
	
}
