package com.nt.test;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class Producer implements CommandLineRunner{
	
	@Autowired
	private JmsTemplate jt;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("From producer");
		
		/*jt.send("queue",new MessageCreator() {
			
			@Override
			public Message createMessage(Session session) throws JMSException {
				
				return session.createTextMessage("-SAMLE-"+new Date());
			}
		});*/
		
		jt.send("My-queue",(ses)->ses.createTextMessage("Mike-Testing "+new Date()));
		
	}

}
