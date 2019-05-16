package com.jpm.spring.emp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpClient {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("autowire.xml");
		
		Employee emp = new Employee();
		EmployeeService service = (EmployeeService) context.getBean("employeeService");
		
		System.out.println(service.add(emp));
	}

}
