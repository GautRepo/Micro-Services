package com.nt.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderRestController {
	
	@Value("${server.port}")
	private int port;
	
	
	@GetMapping("/show")
	public String showData() {
		return "From order "+port;
	}

}
