package com.jpm.spring.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleMain {

	public static void main(String[] args) {
		// create ioc container
//		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");   \\does not invoke DisposableBean.. no close()
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		context.close();
		
		
		
		
		

	}

}
