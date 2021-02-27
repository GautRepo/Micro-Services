package com.nt.store;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class KafkaMessageStore {
	
	private List<String> message = new ArrayList<>();
	
	
	public void add(String input) {
		message.add(input);
	}
	
	public String readAll() {
		return message.toString();
	}

}
