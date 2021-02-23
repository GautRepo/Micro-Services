package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderRestController {
	@Autowired
	private DiscoveryClient client;
	
	
	public String getOrder() {
		RestTemplate rt = new RestTemplate();
		
		List<ServiceInstance> siList = client.getInstances("ORDER-PROVIDER");
		ServiceInstance si = siList.get(0);
		String URL=si.getUri()+"/show";
		
		String res =rt.getForObject(URL, String.class);
		
		return res;
		
	}

}
