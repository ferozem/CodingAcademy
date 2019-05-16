package com.jpm.spring;

public class UserDaoImpl implements UserDao{
	
	public boolean authenticate(String username, String password){
		if((username.equals("admin") && password.equals("admin")))
				return true;
		else 
			return false;
	}

}
