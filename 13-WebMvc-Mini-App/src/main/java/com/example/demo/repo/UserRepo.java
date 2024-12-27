package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.User;

public interface UserRepo extends JpaRepository<User, Integer>{
   
	public User findByEmailAndPwd(String email, String pwd);
}
