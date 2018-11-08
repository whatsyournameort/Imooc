package com.example.demo.feign.fallBack;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.feign.ClientFeign;
import com.example.demo.pojo.Girl;

@Component
public class ClientFallBack implements ClientFeign{

	@Override
	public List<Girl> findByAge(Integer age) {
		return new ArrayList<>();
	}

	@Override
	public List<Girl> findByName(String name) {
		Girl girl = new Girl();
		girl.setAge(58);
		girl.setCupSize("B");
		girl.setName("超时降级了啊！！！！！");
		List<Girl> list = new ArrayList<>();
		list.add(girl);
		return list;
	}

}
