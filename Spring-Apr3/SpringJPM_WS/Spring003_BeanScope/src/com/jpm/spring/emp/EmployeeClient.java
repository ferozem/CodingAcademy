package com.jpm.spring.emp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeClient {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("autowire.xml");
		
		Employee e1 = (Employee) context.getBean("employee1");
		Employee e2 = (Employee) context.getBean("employee1");
		Employee e3 = (Employee) context.getBean("employee2");
		System.out.println("e1.hashcode()...."+e1.hashCode());
		System.out.println("e2.hashcode()...."+e2.hashCode());
		System.out.println("e3.hashcode()...."+e3.hashCode());
		
		
		System.out.println(e1);
		

	}

}
