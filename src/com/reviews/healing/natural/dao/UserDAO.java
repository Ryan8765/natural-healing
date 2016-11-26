package com.reviews.healing.natural.dao;

import java.util.List;

import com.reviews.healing.natural.entity.User;


public interface UserDAO {
	
	
	public List<User> getUsers();
	
	//gets an individual user given the id
	public User getUser(int userID);
	
	
}
