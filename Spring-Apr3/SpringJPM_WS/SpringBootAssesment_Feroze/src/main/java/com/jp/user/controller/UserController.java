package com.jp.user.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jp.user.entities.User;
import com.jp.user.exception.UserException;
import com.jp.user.service.IUserService;

@RestController 
@RequestMapping("/api/users") 
public class UserController {
	@Autowired
	private IUserService userService;

	//http://localhost:8085/api/users
	@GetMapping(value="",produces="application/json")
	public List<User> getAllUser() throws UserException{
		return userService.getUserList();
	}
	
	//http://localhost:8085/api/users/id/1
	@GetMapping(value="/id/{id}",produces="application/json")
	public ResponseEntity<User> getEmployeeById(@PathVariable(value = "id") int id ) throws UserException{
		User user = userService.getUserById(id);
		return ResponseEntity.ok().body(user);
	}
	
	//http://localhost:8085/api/users/save
	@PostMapping("/save")
	public HttpStatus saveUser(@RequestBody User user) throws UserException{
		return userService.addUser(user) != null? HttpStatus.CREATED :HttpStatus.BAD_REQUEST;
	}
	//http://localhost:8085/api/users/updateUser/1
	@PutMapping("/updateUser/{id}")
	public HttpStatus updateUser(@PathVariable(value = "id") int id, @Valid @RequestBody User userDetails)throws UserException{
		User user = userService.getUserById(id);
		if (user == null)
		{
			return HttpStatus.BAD_REQUEST;
		}
		else
		{
			user.setFirstName(userDetails.getFirstName());
			user.setLastName(userDetails.getLastName());
			return userService.updateUser(user)?HttpStatus.ACCEPTED :HttpStatus.BAD_REQUEST;
			
		}
		
	}
	//http://localhost:8082/api/users//deleteUser/1
	@DeleteMapping("/deleteUser/{id}")
	public Map<String, Boolean> deleteUser(@PathVariable int id) throws UserException{
		User user = userService.getUserById(id);
		Map<String, Boolean> response = new HashMap<>();
		if (user != null)
		{
			userService.deleteUserById(id);
			response.put("deleted", Boolean.TRUE);
			
		}
		
		return response;
	}
}
