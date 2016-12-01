package com.reviews.healing.natural.service;

import java.util.List;

import com.reviews.healing.natural.entity.User;

public interface UserService {
	
	/*
	 * Functions for obtaining users
	 */
	public List<User> getUsers();
	
	public User getUser(int userID);
	
	public User getCurrentUser();
	
	
	/*
	 * Functions for creating user
	 */
	public void saveNewUser( User theUser );
	
}
