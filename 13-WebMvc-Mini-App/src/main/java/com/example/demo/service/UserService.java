package com.example.demo.service;

import com.example.demo.entity.User;

public interface UserService {
	
	public Boolean saveUser(User user);
	
	public User getUser(String email,String pwd);
	
	

}
