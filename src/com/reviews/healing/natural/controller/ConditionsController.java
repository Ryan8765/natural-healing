package com.reviews.healing.natural.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.reviews.healing.natural.entity.Condition;
import com.reviews.healing.natural.entity.User;
import com.reviews.healing.natural.service.ConditionService;
import com.reviews.healing.natural.service.UserService;
import com.reviews.healing.natural.util.ConditionsOrderByUtil;

@Controller	
@RequestMapping("/conditions")
public class ConditionsController {
	
	@Autowired
	private ConditionService conditionService;
	
	@Autowired 
	private UserService userService;
	
	@GetMapping("/find-conditions")
	public String findConditions( Model theModel ) {
		
		//get all the conditions ordered by alphabetically
		List<Condition> conditions = conditionService.listAllConditions( ConditionsOrderByUtil.ALPHABETICAL );
		
		//add the conditions to the model
		theModel.addAttribute("conditions", conditions );
		
		return "find-conditions";
	}
	
	
	@GetMapping("/condition-created")
	public String conditionCreated( Model theModel ) {
		return "condition-created";
	}
	
	
	@GetMapping("/create-condition")
	public String createCondition( Model theModel ) {
		//setting generic ID for now (corresponds to my record in the database).
		int userID = 1;
		Condition theCondition = new Condition();
		theCondition.setId(userID);
		
		
		theModel.addAttribute("condition", theCondition);
		
		return "create-condition";
	}
	
	
	
	/*
	 * 	Used for creating a new condition.  Handles form request from "create-condition"
	 */
	@PostMapping("/create-condition")
	public String saveCondition( @ModelAttribute("condition") Condition theCondition ) {
		
		//get the current user
		User currentUser = userService.getCurrentUser();
		
		//set the related user field to the current user logged in
		theCondition.setRelated_user(currentUser);
		
		
		//save the condition using the service
		conditionService.saveCondition( theCondition );
		
		return "redirect:/conditions/condition-created";
	}
	
	
	
	
}
