package com.jpm.spring.emp;

public class Greeting implements IGreetings {

	@Override
	public String greet(String name) {
		return "Hello, " +name; 
	}

}
