package com.jpm.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class aopMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");
		
		CustomerService customerService = (CustomerService) context.getBean("customerService");
		
		customerService.withdraw(1000);
		customerService.logout();
		System.out.println("==================");
		
		try {
			customerService.login();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
