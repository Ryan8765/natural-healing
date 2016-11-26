package com.reviews.healing.natural.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.reviews.healing.natural.dao.UserDAO;
import com.reviews.healing.natural.entity.User;


@Service
public class UserServiceImpl implements UserService {
	
	//need to inject the customer DAO
	@Autowired
	private UserDAO userDAO;
	
	@Override
	@Transactional
	public List<User> getUsers() {
		return userDAO.getUsers();
	}
	

	@Override
	@Transactional
	public User getUser(int userID) {
		// TODO Auto-generated method stub
		return userDAO.getUser(userID);
	}
	

}
