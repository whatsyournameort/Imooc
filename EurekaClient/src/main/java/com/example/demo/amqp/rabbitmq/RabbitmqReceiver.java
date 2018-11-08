package com.example.demo.amqp.rabbitmq;

import java.util.Map;

import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;


@Component
public class RabbitmqReceiver {
	
	@RabbitListener(bindings= @QueueBinding(
			value=@Queue("rabbitmqQueue"),
			exchange=@Exchange("rabbitmqExchange"),
			key="rabbitmq"
	))
	@RabbitHandler
	public void handleMessage(@Payload String body,@Headers Map<String, Object> map) {
		System.err.println("Body: " + body + "; map: " +map.toString());
	}
}
