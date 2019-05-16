package com.jpm.spring.hello;

public class HelloWorld implements IGreeting {
	public HelloWorld(){
		System.out.println("Hello World instantiated....");
	}
	
	@Override
	public String greet(){		
		return "Hello World";
	}

}
