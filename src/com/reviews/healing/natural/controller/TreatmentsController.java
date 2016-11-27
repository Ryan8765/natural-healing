package com.reviews.healing.natural.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/treatments")
public class TreatmentsController {
	
	//list all treatments for a condition
	@GetMapping("/condition-treatments")
	public String showConditionTreatments( Model theModel ) {
		return "condition-treatments";
	}
	
	//create a treatment for a condition
	@GetMapping("/create-treatment")
	public String createTreatment ( Model theModel ) {
		return "create-treatment";
	}
	
	//show a treatment
	@GetMapping("/treatment/{treatmentID}")
	public String showTreatment ( Model theModel, @PathVariable String treatmentID ) {
		return "treatment";
	}
	
	
}
