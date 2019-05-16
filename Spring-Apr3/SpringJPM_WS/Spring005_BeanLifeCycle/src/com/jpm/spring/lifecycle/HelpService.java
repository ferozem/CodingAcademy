package com.jpm.spring.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class HelpService implements BeanNameAware, BeanFactoryAware, InitializingBean, DisposableBean, BeanPostProcessor {
	private int helpServiceId;

	
	public HelpService() {
		System.out.println("1> Bean Instantiations...");
	}

	public int getHelpServiceId() {
		return helpServiceId;
	}

	public void setHelpServiceId(int helpServiceId) {
		System.out.println("2> Property Instantialization...");
		this.helpServiceId = helpServiceId;
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("3> BeanNameAware...beanName:" +name);
		
	}

	@Override
	public void setBeanFactory(BeanFactory name) throws BeansException {
		System.out.println("4> BeanFactoryAware...beanName:" +name);
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("6> InitializingBean...afterPropertiesSet():");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("7> DisposableBean...destroy():");
		
	}
	
	//@PostConstruct
	public void myInit() {
		System.out.println("8> custom init...init():");
		
	}
	
	//@PreDestroy
	public void myDestroy() {
		System.out.println("9> custom init...destroy():");
		
	}

	@Override
	public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
		System.out.println("5> BeanPostProcessor  AFTER...postProcessAfterInitialization():");
		return arg0;
	}

	@Override
	public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
		System.out.println("5> BeanPostProcessor BEFORE...postProcessBeforeInitialization():");
		return arg0;
	}
	
	

}
