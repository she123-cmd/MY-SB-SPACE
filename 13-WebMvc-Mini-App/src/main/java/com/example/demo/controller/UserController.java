package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@Controller
public class UserController {

	@Autowired
	public UserService userService;
	
	//handle-login --Get
	@GetMapping("/login")
	public String UserLogin(Model model)
	{
		model.addAttribute("user", new User());
		return "index";
	}
	
	//submit-login --post
	@PostMapping("/login")
	public String HandelLogin(User user ,Model model)
	{
		User userobj=userService.getUser(user.getEmail(), user.getPwd());
		
		if(userobj==null)
		{
			model.addAttribute("emsg", "Invalid Credentials");
			return "index";
		}
		else
		{
			return "dashbord";
		}
	}
	
	//handle-register --Get
	@GetMapping("/register")
	public String Userregister(Model model)
	{
		model.addAttribute("user", new User());
		return "register";
	}
	
	//submit-register --post
	@PostMapping("/register")
	public String HandelRegister(User user, Model model)
	{
		Boolean status =userService.saveUser(user);
		
		if(status)
		{
			model.addAttribute("smsg", "User Registered...");
		}
		else
		{
			model.addAttribute("emsg", "Registered failed...");
		}
		return "register";
	}
	
	//logout
	@GetMapping("/logout")
	public String Logout(Model model)
	{
		model.addAttribute("user", new User());
		return "index";
	}
}
