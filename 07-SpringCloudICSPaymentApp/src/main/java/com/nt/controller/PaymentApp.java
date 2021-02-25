package com.nt.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentApp {
	
	@Value("${my.app.code}")
	private String data; 
	
	@GetMapping("/show")
	private String getPay() {
		return "PAYMENT-APP";
	}

}
