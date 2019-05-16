package com.jp.user.service;
import java.util.List;

import com.jp.user.entities.User;
import com.jp.user.exception.UserException;

public interface IUserService {
	//CRUDS Operation
	public Integer addUser(User user)throws UserException;//C-create
	public List<User> getUserList()throws UserException;//R All Employee -retrieve
	public boolean updateUser(User user)throws UserException;//U-update
	public boolean deleteUserById(int id)throws UserException;//D-delete
	public User getUserById(int id)throws UserException;//S-search
}
