package com.jpm.spring.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloClient {

	public static void main(String[] args) {
		//HelloWorld hw = new HelloWorld();
		//Spring IOC Container
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		
		//HelloWorld h1 = (HelloWorld) context.getBean("helloObj");//object
//		IGreeting h1 = (IGreeting) context.getBean("springHelloWorld");
//		
//		System.out.println(h1.greet());
		
		//System.out.println(hw.greet());
		//System.out.println("Spring Container managing....");
		
		IGreeting h1 = (IGreeting) context.getBean("hello");
		System.out.println((h1.greet()));
	}

}