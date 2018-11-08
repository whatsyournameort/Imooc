package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.pojo.Girl;
import com.example.demo.repository.GirltRepository;

@Service
public class GirlService {

	@Autowired
	private GirltRepository girltRepository;
	
	public List<Girl> findByName(String name){
		return girltRepository.findByName(name);
	}
	
	public List<Girl> findByAge(Integer age){
		return girltRepository.findByAge(age);
	}
}
