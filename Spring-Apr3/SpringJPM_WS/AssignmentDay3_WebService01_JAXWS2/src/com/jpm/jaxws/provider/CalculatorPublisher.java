package com.jpm.jaxws.provider;

import javax.xml.ws.Endpoint;

import com.jpm.jaxws.Calculator;
import com.jpm.jaxws.CalculatorImpl;

public class CalculatorPublisher {

	public static void main(String[] args) {
		Calculator c1=new CalculatorImpl();
		Endpoint.publish("http://localhost:6099/ws/calc", c1);
		System.out.println("Calculator Service Publish....");

	}

}//CalculatorImpService
//http://localhost:5555/ws/calc?wsdl
