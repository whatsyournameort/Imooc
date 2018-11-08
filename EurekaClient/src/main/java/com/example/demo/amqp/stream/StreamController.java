package com.example.demo.amqp.stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/amqp/stream")
public class StreamController {

	@Autowired
	private StreamClient streamClient;
	
	@GetMapping
	public String sendByStream() {
		streamClient.streamOutput().send(MessageBuilder.withPayload("message").build());
		return "send msg by stream";
	}
	
	@StreamListener("streamInput")
	public void handleMsg(String body) {
		System.err.println(body);
	}
}
