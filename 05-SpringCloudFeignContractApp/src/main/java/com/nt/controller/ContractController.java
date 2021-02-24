package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContractController {
	
	@Autowired
	private VenderRestConsumer vrc;
	
	@GetMapping("/contract")
	public String getVender() {
		return "From Contract::"+vrc.getVend();
	}

}
