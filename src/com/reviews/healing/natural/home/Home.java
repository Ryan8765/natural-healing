package com.reviews.healing.natural.home;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Home {
	
	@RequestMapping("/")
	public String homeController( Model theModel ) {
		
		return "index";
	}

}
