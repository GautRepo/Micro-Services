package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CustomerController {
	
	@Autowired
	private LoadBalancerClient lbc;
	
	
	public String getFromCust() {
		ServiceInstance si= lbc.choose("CUSTOMER-APP");
		String URL =si.getUri()+"/show";
		RestTemplate rt = new RestTemplate();
		String res = rt.getForObject(URL, String.class);
		return res;
		
	}

}
