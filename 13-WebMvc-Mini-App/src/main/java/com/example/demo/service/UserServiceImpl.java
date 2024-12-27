package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repo.UserRepo;
import com.example.demo.utils.EmailUtils;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private EmailUtils emailUtils;
	@Override
	public Boolean saveUser(User user) {
		// TODO Auto-generated method stub
		   User savedUser= userRepo.save(user);
		   
		   if(savedUser.getUid()!=null)
		   {
			   String subject = "Your Account Created - Ashok IT";
			String body = "<h1>Congratulations, welcome to board..</h1>";
			   emailUtils.SendEmail(user.getEmail(), subject, body);
		   }
		return true ;
	}

	@Override
	public User getUser(String email, String pwd) {
		// TODO Auto-generated method stub
		   return userRepo.findByEmailAndPwd(email, pwd);
		
	}

}
