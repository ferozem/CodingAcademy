package com.jpm.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserClient {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		
		UserDao user = (UserDao) context.getBean("userDao");
		
		System.out.println(user);
		
	}

}
