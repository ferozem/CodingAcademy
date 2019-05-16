package com.jpm.jaxws.consumer;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.jpm.jaxws.Greeting;

public class GreetingConsumer {

	public static void main(String[] args) throws MalformedURLException {
		//GreetingImpService
		URL wsdl = new URL("http://localhost:5555/ws/greet?wsdl");
		// 1st argument service url refer to wsdl doc above
		QName endPointName = new QName("http://jaxws.jpm.com/", "GreetingImpService");
		Service service = Service.create(wsdl, endPointName);
		
		
		//proxy obj for published service 
		Greeting greetObj = service.getPort(Greeting.class);
		
		//calling the actual method
		System.out.println(greetObj.getGreetingAsString("Feroze"));

		
	}

}
