package com.jpm.spring_boot.dao;

import org.springframework.stereotype.Repository;

import com.jpm.spring_boot.entity.User;

//prepwork -- annotate Dao with Repositry 

@Repository
public class UserDao implements IUserDao {

	//presistantContext autorwired

	@Override
	public User getUserById(Long userId) {
		User user = new User(userId,"Feroze","password","admin");
		return user;
	}

	@Override
	public User addUser(User user) {
		System.out.println("User added in database:" +user);
		return user;
	}

	@Override
	public User updateUser(User user) {
		System.out.println("User updated in database:" +user);
		return user;
	}
	
}
