package com.reviews.healing.natural.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.reviews.healing.natural.dao.UserDAO;
import com.reviews.healing.natural.entity.User;
import com.reviews.healing.natural.service.UserService;

@Controller
@RequestMapping("/account")
public class AccountController {
	
	//need to inject our user service
	@Autowired
	private UserService userService;
	
	//shows login form
	@GetMapping("/login-form/{id}")
	public String showLoginForm( Model theModel, @PathVariable("id") int id ) {
		
		//get the users
		List<User> theUsers = userService.getUsers();
		
		
		//add the users to the model
		theModel.addAttribute("users", theUsers);
		
		//add the id to the model
		theModel.addAttribute("id", id);
		
		
		return "login-form";
		
	}
	
	//logout success form
	@GetMapping("/logout-success")
	public String showLogoutSuccess( Model theModel ) {
		
		return "logout-success";
		
	}
	
	
	//show create account form
	@GetMapping("/create-account")
	public String showCreateAccountForm( Model theModel ) {
		return "create-account";
	}
	
	
	//show user account page 
	@GetMapping("/user-account")
	public String showUserAccount( Model theModel ) {
		return "user-account";
	}
	
	
	//reset user password
	@GetMapping("/reset-password")
	public String resetPassword( Model theModel ) {
		return "reset-password";
	}
	
	
	
}
