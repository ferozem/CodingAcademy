package com.jpm.spring.hello;

public class SpringHelloWorld implements IGreetings {
	
	

	public SpringHelloWorld() {
		System.out.println("springHelloWorld instantiated..");
	
	}

	@Override
	public String greet() {
		// TODO Auto-generated method stub
		return "Spring HelloWorld";
	}

}
