package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

	@Autowired
	private DiscoveryClient client;
	
	@GetMapping("/consume")
	public String callProducer() {
		String URL ="";
		
		RestTemplate rt  = new RestTemplate();
		List<ServiceInstance> siList=client.getInstances("EMP-PRODUCER");
		ServiceInstance si =siList.get(0);
		URL=si.getUri()+"/show";
		
		String res=rt.getForObject(URL, String.class);
		return "Get is Called from consumer=>"+res;
	}
}
