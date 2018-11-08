package com.example.demo.contorller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.feign.ClientFeign;
import com.example.demo.pojo.Girl;

@RestController
@RequestMapping("/other")
public class OtherController {
	
	@Autowired
	private ClientFeign clientFeign;
	
	@GetMapping("/name/{name}")
	public List<Girl> findNameByFeign(@PathVariable String name) throws InterruptedException{
		return clientFeign.findByName(name);
	}

	@GetMapping("/age/{age}")
	public List<Girl> findAgeByFeign(@PathVariable Integer age){
		return clientFeign.findByAge(age);
	}
	
	
}
