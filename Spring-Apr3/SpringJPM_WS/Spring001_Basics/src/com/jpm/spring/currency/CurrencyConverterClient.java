package com.jpm.spring.currency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CurrencyConverterClient {

	public static void main(String[] args) {
		//spring IOC container
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");  // classpath creates resource folder in the source folder
		
		CurrencyConverter curr = (CurrencyConverter) context.getBean("conObj");
		
		double rupees = curr.dollarsToRupees(50);
		System.out.println(rupees);
		
		
		
		
		

	}

}
