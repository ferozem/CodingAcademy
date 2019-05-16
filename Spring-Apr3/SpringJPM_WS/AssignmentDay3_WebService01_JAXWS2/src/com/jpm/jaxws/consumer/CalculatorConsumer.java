package com.jpm.jaxws.consumer;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.jpm.jaxws.Calculator;

public class CalculatorConsumer {

	public static void main(String[] args) throws MalformedURLException {
		//GreetingImpService
		URL wsdl = new URL("http://localhost:6099/ws/calc?wsdl");
		// 1st argument service url refer to wsdl doc above
		QName endPointName = new QName("http://jaxws.jpm.com/", "CalculatorImplService");
		Service service = Service.create(wsdl, endPointName);
		
		
		//proxy obj for published service 
		Calculator calcObj = service.getPort(Calculator.class);
		//Greeting greetObj = service.getPort(Greeting.class);
		
		//calling the actual method
		System.out.println(calcObj.addition(10, 20));
		//System.out.println(greetObj.getGreetingAsString("Feroze"));

		
	}

}
