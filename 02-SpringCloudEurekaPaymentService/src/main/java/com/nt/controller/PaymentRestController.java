package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentRestController {
	
	@Autowired
	private OrderRestController orc;
	
	@GetMapping("/payment")
	public String showPaymentData() {
		return "FROM-PAYMENT=>"+orc.getOrder();
	}

}
