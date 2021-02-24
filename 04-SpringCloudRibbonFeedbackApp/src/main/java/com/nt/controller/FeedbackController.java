package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeedbackController {

	@Autowired
	private CustomerController cc;
	
	@GetMapping("/consume")
	public String getFeed() {
		return "From feedback"+cc.getFromCust();
	}
	
	
}
