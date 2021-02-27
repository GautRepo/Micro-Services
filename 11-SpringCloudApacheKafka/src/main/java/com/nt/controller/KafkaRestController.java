package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nt.service.producer.KafkaProducerService;
import com.nt.store.KafkaMessageStore;

@RestController
public class KafkaRestController {
	
	@Autowired
	private KafkaProducerService producer;
	
	@Autowired
	private KafkaMessageStore store;
	
	@GetMapping("/send")
	public String sendMsgToProducer(@RequestParam("message") String msg) {
		producer.sendToKafka(msg);
		return "DONE "+msg;
	}
	
	@GetMapping("/all")
	public String getAllMsg() {
		String allMsg=store.readAll();
		
		return allMsg;
	}

}
