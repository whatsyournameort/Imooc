package com.example.demo.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.pojo.Girl;

@FeignClient(name="client",fallback=com.example.demo.feign.fallBack.ClientFallBack.class)
public interface ClientFeign {
	
	@GetMapping("/girl/age/{age}")
	public List<Girl> findByAge(@PathVariable(value="age") Integer age);

	@GetMapping("/girl/name/{name}")
	public List<Girl> findByName(@PathVariable(value="name") String name);
	
}
