package com.example.demo.hystrix;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

@RestController
@RequestMapping("/hystrix")
@DefaultProperties(defaultFallback="defaultFallBack")
public class HystrixController {
	
//	@HystrixCommand(fallbackMethod="fallBack")
	@HystrixCommand(commandProperties= {
			@HystrixProperty(name="execution.timeout.enabled",value="false")
	})
	@GetMapping
	public String getHystrix() {
		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject("http://127.0.0.1:8082/hystrix/timeout", String.class);
		return result;
	}
	
	public String fallBack() {
		return "降级方法处理中~";
	}
	
	public String defaultFallBack() {
		return "默认方法处理中";
	}

	@GetMapping("/timeout")
	public String timeOutMethod() {
		try {
			Thread.sleep(2000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "超时方法处理中";
	}
}
