package com.example.demo.controller;

import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.Girl;
import com.example.demo.service.GirlService;

@RestController
@RequestMapping("/girl")
public class GirlController {

	@Autowired
	private GirlService girlService;
	
	@GetMapping("setCookie")
	public String SetCookie(HttpServletResponse response) {
		response.addCookie(new Cookie("girl", "sofeiya"));
		return "set cookie success";
	}
	
	@GetMapping("/age/{age}")
	public List<Girl> findByAge(@PathVariable Integer age){
		return girlService.findByAge(age);
	}

	@GetMapping("/name/{name}")
	public List<Girl> findByAge(@PathVariable String name){
		try {
			Thread.sleep(2000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return girlService.findByName(name);
	}
}
