package com.jpm.spring.SpringBoot04_Security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{


	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.cors().disable().authorizeRequests().anyRequest().authenticated().and().httpBasic();
	}
	
	@Autowired
	public void configureGlobal (AuthenticationManagerBuilder builder) throws Exception{
		builder.inMemoryAuthentication().withUser("user1").password("{noop}password").roles("USER");
		
	}
	

}
