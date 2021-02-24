package com.nt.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="VENDER-APP")
public interface VenderRestConsumer {
	
	@GetMapping("/vender/show")
	public String getVend();

}
