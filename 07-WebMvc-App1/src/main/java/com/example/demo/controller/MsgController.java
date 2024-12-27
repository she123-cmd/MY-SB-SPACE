package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MsgController {
	
	@GetMapping("/greet")
	public ModelAndView getmsg2() {
		ModelAndView mav=new ModelAndView();
		
		mav.addObject("msg", "Good morniing....");
		mav.setViewName("index");
		
		return mav;
	}

	@GetMapping("/welcome")
	public ModelAndView getmsg1()
	{
		ModelAndView mav =new ModelAndView();
		
		mav.addObject("msg", "Welcome to sangli");
		mav.setViewName("index");
		
		return mav;
	}
}
