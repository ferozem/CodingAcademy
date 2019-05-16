package com.jpm.spring_boot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jpm.spring_boot.entity.User;
import com.jpm.spring_boot.service.IUserService;

/*
 * 
 * 	@RequestMapping (@Path)
 * 		-- used at class level
 * 		-- method level
 * 	4.3 onwards mapping made more simple
	@GetMapping
	@PostMapping
	@PutMapping
	@DeleteMapping
	@PatchMapping
 * */

@RestController
public class MyHomeController {
	
	@Autowired
	private IUserService userService;
	
	@ResponseBody
	@GetMapping("/")
	public String greetUser(){
		return "Hello from Spring Boot!";
	}
	
	@GetMapping(path ="/userList", produces="application/json")
	public List<User> getAllUsers(){
		List<User> userList = new ArrayList<>();
		userList.add(new User(23L, "admin", "admin","admin"));
		return userList;
	}
	
	@GetMapping(path="/getUser/{userId}", produces="application/json")
	//value passed along with url, variable passed along with path
	public User getUserById(@PathVariable Long userId){
		return userService.getUserById(userId);
	}
	
	//http://localhost:8080/addUser
	@PostMapping(path="/addUser")
	public String addUser(@RequestBody User user){
		User addedUser = userService.addUser(user);
		if(addedUser!=null)
			return "OK";
		else 
			return "Adding User Failed";
	}
	
	
	public ResponseEntity<Object> updateUser(@RequestBody User user, @PathVariable Long id){
		User userFound = userService.getUserById(id);
		if(userFound == null)
			return ResponseEntity.notFound().build();
		user.setUserId(id);
		
		userService.updateUser(user);
		System.out.println("Record updated" + user);
		return ResponseEntity.ok(user);
	}


}
