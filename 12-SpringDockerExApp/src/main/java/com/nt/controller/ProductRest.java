package com.nt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductRest {
	
	@GetMapping("/home")
	public String show() {
		
		return "Product Controller";
	}

}
