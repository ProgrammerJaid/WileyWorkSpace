package com.wiley_spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class TestBeansFactory {

	public static void main(String[] args) {
		
		BeanFactory beanFact = new 
				XmlBeanFactory(new ClassPathResource("beans.xml"));
		
		System.out.println("Done.\n");
		
	}
	
}
