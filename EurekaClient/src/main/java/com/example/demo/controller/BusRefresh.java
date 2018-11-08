package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.config.GirlConfigProperties;

@RestController
@RequestMapping("/bus-refresh")
//@RefreshScope
public class BusRefresh {
	
	@Value("${env}")
	private String env;
	
	@GetMapping("/env")
	public String getEnv() {
		return env;
	}
	
	@Autowired
	private GirlConfigProperties girlConfigProperties;
	
	@GetMapping
	public String getRefresh() {
		return girlConfigProperties.toString();
	}
}
