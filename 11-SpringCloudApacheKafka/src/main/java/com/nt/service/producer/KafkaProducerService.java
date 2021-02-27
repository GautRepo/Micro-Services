package com.nt.service.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {
	
	@Autowired
	private KafkaTemplate<String, String> kafTemp;

	@Value("${my.kafka.tpcname}")
	private String topic;
	
	public void sendToKafka(String data) {
		System.out.println("Sending from producer to kafka ::"+data);
		
		kafTemp.send(topic,data);
	}
	
}
