package com.jpm.spring.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloClient {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");  // classpath creates resource folder in the source folder
		
		System.out.println("Spring Container managing bean..");
		
		IGreetings h1 = (IGreetings) context.getBean("helloObj");
//		IGreetings h1 = context.getBean("helloObj",IGreetings.class );
		System.out.println(h1.greet());
		
		System.out.println("===============");
		
		IGreetings h2 = (IGreetings) context.getBean("helloObj1");
		System.out.println(h2.greet());

	}

}
