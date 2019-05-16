
package com.jpm.spring.hello;


public class SpringHelloWorld implements IGreeting{
	public SpringHelloWorld (){
		System.out.println("Spring Hello World instantiated ....");
	}

	@Override
	public String greet() {		
		return "Spring Hello World !!!!";
	}

}
