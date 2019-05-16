package com.jp.user.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.jp.user.entities.User;
import com.jp.user.exception.UserException;



@Repository
public class UserDao implements IUserDao {

	@PersistenceContext
	private EntityManager entityManager; 
	
	@Override
	public Integer addUser(User user) throws UserException {
		
		entityManager.persist(user);
		return user.getId();
		
	}

	@Override
	public User getUserById(int id) throws UserException {
		User user = entityManager.find(User.class, id);
		return user;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<User> getUserList() throws UserException {
		Query query = entityManager.createQuery("from User");
		return query.getResultList();
	}

	@Override
	public boolean updateUser(User user) throws UserException {
		
		return entityManager.merge(user)!=null;
	}

	@Override
	public boolean deleteUserById(int id) throws UserException {
		User user = getUserById(id);
		if (user==null)
		{
			return false;
		}
		else{
			entityManager.remove(user);
			return true;
		}
		
	}

}
