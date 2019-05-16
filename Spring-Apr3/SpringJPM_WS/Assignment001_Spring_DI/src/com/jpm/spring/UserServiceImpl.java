package com.jpm.spring;

public class UserServiceImpl implements UserService {
	
		private UserDao userDao;
		
		
		
	public UserDao getUserDao() {
			return userDao;
		}

	public void setUserDao(UserDao userDao) {
			System.out.println("setUserDao....");
			this.userDao = userDao;
		}

	@Override
	public boolean authenticate(String username, String password) {
		return userDao.authenticate(username, password);
		}

}
