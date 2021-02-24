package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
	
	@Autowired
	private OrderRestConsumer consumer;
	
	@GetMapping("/consume")
	public String findMsg() {
		return "CONSUMER=>"+consumer.doHttpCall();
	}

}
