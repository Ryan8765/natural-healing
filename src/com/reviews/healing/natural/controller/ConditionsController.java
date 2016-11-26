package com.reviews.healing.natural.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.reviews.healing.natural.entity.Condition;
import com.reviews.healing.natural.service.ConditionService;

@Controller	
@RequestMapping("/conditions")
public class ConditionsController {
	
	@Autowired
	private ConditionService conditionService;
	
	@GetMapping("/find-conditions")
	public String findConditions( Model theModel ) {
		return "find-conditions";
	}
	
	
	@GetMapping("/contition-created")
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
	
	
	@PostMapping("/create-condition")
	public String saveCondition( @ModelAttribute("condition") Condition theCondition ) {
		
		//save the condition using the service
		conditionService.saveCondition( theCondition );
		
		return "redirect:/conditions/create-condition";
	}
	
	
	
	
}
