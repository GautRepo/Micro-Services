package com.nt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {

	@GetMapping("/show")
	public String showmsg() {
		return "Get is called from producer";
	}
}
