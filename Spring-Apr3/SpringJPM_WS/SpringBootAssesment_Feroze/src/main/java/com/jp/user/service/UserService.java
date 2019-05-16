package com.jp.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jp.user.dao.IUserDao;
import com.jp.user.entities.User;
import com.jp.user.exception.UserException;



@Service
public class UserService implements IUserService {
	@Autowired
	private IUserDao userDao;
	@Override
	@Transactional
	public Integer addUser(User user) throws UserException {
		return userDao.addUser(user);
	}

	@Override
	public List<User> getUserList() throws UserException {// TODO Auto-generated method stub
		return userDao.getUserList();
	}

	@Override
	@Transactional
	public boolean updateUser(User user) throws UserException {
		return userDao.updateUser(user);
	}

	@Override
	@Transactional
	public boolean deleteUserById(int id) throws UserException {
		return userDao.deleteUserById(id);
	}

	@Override
	public User getUserById(int id) throws UserException {
		return userDao.getUserById(id);
	}

}
