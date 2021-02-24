package com.nt.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vender")
public class VenderController {
	
	@Value("${server.port}")
	private int port; 
	
	@GetMapping("/show")
	public String getVend() {
		return "FROM VENDER " +port;
	}

}
