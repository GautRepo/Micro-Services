package com.nt.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	
	@Value("${my.app.name}")
	private String data;
	
	@GetMapping("/show")
	public String getMsg() {
		return "From Customer";
	}

}
