package com.jp.user.dao;

import java.util.List;

import com.jp.user.entities.User;
import com.jp.user.exception.UserException;



public interface IUserDao {
	public Integer addUser(User user)throws UserException;//C-create
	public List<User> getUserList()throws UserException;//R All Employee -retrieve
	public boolean updateUser(User employee)throws UserException;//U-update
	public boolean deleteUserById(int empId)throws UserException;//D-delete
	public User getUserById(int empId)throws UserException;//S-search
}
