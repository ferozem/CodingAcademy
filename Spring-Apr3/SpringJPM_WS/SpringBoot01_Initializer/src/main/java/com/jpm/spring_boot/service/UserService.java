package com.jpm.spring_boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpm.spring_boot.dao.IUserDao;
import com.jpm.spring_boot.entity.User;

//prepwork 1 -- annotate Dao with @Service 
@Service(value = "userService")
public class UserService implements IUserService {
	
	//prepwork 2 - inject dao object
	private IUserDao userDao;
	
	@Override
	public User getUserById(Long userId) {
		//prep work 4 -- to call dao meathod in service
		return userDao.getUserById(userId);
	}
	
	
	//prep work 3 -- autowire setter method for dao
	@Autowired
	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}


	@Override
	public User addUser(User user) {
		return userDao.addUser(user);
	}


	@Override
	public User updateUser(User user) {
		return userDao.updateUser(user);
	}

	
}
