package com.jpm.spring.hello;

public class HelloWorld implements IGreetings {
	
	
	
	public HelloWorld() {
		System.out.println("HelloWorld instantiated.... ");
		
	}
	@Override
	public String greet(){
		return "Hello, from Spring!";
	}

}
