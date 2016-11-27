package com.reviews.healing.natural.service;

import java.util.List;

import com.reviews.healing.natural.entity.User;

public interface UserService {
	
	public List<User> getUsers();
	
	public User getUser(int userID);
	
	public User getCurrentUser();
	
}
