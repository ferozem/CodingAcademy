package com.jpm.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * How to create Restfull webservices in spring boot
 * create a class in the base package.controller and annotate
 * then class with @RestController
 * 
 * */

@RestController
@RequestMapping("/api/home")
public class HomeController {
	
	@GetMapping("")
	public String greetUser(){
		return "Hello From Spring Boot Secured App";
	}

}
