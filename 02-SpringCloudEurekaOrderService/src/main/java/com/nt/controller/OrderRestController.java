package com.nt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderRestController {
	
	@GetMapping("/show")
	public String showOrderInfo() {
		return "From order";
	}

}
