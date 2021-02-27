package com.nt.service.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.nt.store.KafkaMessageStore;

@Service
public class KafkaConsumerService {
	
	@Autowired
	private KafkaMessageStore store;
	
	@KafkaListener(topics ="${my.kafka.tpcname}" ,groupId = "abc")
	public void readMsgfromKafka(String msg) {
		System.out.println("Data recevied from kafka=>"+msg);
		store.add(msg);
	}

}
