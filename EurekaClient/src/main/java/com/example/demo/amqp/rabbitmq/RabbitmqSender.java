package com.example.demo.amqp.rabbitmq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/amqp/rabbitmq")
public class RabbitmqSender {

	@Autowired
	private AmqpTemplate amqpTemplate;
	
	@GetMapping
	public String sendByRabbitmq() {
		amqpTemplate.convertAndSend("rabbitmqExchange","rabbitmq","this is a message!");
		return "success send msg by rabbitmq!";
	}
}
