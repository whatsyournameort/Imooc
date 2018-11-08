package com.example.demo.amqp.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface StreamClient {
	
	@Input("streamInput")
	SubscribableChannel streamInput();
	
	@Output("streamOutput")
	MessageChannel streamOutput();

}
