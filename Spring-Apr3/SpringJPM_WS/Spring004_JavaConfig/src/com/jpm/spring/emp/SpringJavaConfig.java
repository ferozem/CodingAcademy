package com.jpm.spring.emp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


//mark the class with @configuration to make is java config file
@Configuration
public class SpringJavaConfig {
	
	@Bean(name = "greeting")
	public IGreetings getGreeting(){
		return new Greeting();
	}
}
