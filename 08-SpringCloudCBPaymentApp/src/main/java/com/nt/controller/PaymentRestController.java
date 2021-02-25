package com.nt.controller;

import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class PaymentRestController {
	
	@GetMapping("/pay")
	@HystrixCommand(fallbackMethod = "dummyPay")
	public String getPay() {
		System.out.println("acutual");
		
		if(new Random().nextInt(15)<10)
			throw new RuntimeException("What the fuck!!!!");
		System.out.println("from actual service end");
		
		return "SUCCESS";
	}
	
	public String dummyPay() {
		System.out.println("dummy");
		
		return "Contact Admin";
	}
}
