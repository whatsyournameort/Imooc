package com.example.demo.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.pojo.Girl;

@Repository
public interface GirltRepository extends JpaRepository<Girl, Integer>{

		public List<Girl> findByAge(Integer age);
		
		public List<Girl> findByName(String name);
		
}
