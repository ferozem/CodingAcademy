package com.jpm.spring.currency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CurrencyConverterClient {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		
		CurrencyConverter curr = (CurrencyConverter) context.getBean("currencyConverter");
		
		double rupees = curr.dollarsToRupees(50.0);
		System.out.println("50$ value is Rs." + rupees);
		
	}

}
