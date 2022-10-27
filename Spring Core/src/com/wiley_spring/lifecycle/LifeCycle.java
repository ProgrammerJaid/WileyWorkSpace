package com.wiley_spring.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LifeCycle implements InitializingBean,BeanNameAware,BeanFactoryAware,DisposableBean {

	
	@Override
	public void setBeanName(String arg0) {
		System.out.println("In setBeanName() method... "+arg0);
	}
	
	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		System.out.println("In setBeanFactory() method...");
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("In afterPropertiesSet...");
	}
	

	@Override
	public void destroy() throws Exception {
		System.out.println("Inside destroy() method...");
	}
	
}
