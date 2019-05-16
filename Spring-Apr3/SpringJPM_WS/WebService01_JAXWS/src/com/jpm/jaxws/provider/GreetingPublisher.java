package com.jpm.jaxws.provider;

import javax.xml.ws.Endpoint;

import com.jpm.jaxws.Greeting;
import com.jpm.jaxws.GreetingImp;

public class GreetingPublisher {

	public static void main(String[] args) {
		Greeting g1=new GreetingImp();
		Endpoint.publish("http://localhost:5555/ws/greet", g1);
		System.out.println("Greeting Service Publish....");

	}

}//GreetingImpService
//http://localhost:5555/ws/greet?wsdl
