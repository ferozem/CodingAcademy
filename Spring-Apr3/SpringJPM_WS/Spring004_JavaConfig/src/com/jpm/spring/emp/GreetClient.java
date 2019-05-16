package com.jpm.spring.emp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GreetClient {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringJavaConfig.class);
		
		IGreetings g1 = (IGreetings) context.getBean("greeting");
		System.out.println(g1.greet("Feroze"));
	}

}
