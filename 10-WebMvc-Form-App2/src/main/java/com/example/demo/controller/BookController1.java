package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.bindings.Book;



@Controller
public class BookController1 {

	// method-1 : to load form (GET)
	@GetMapping("/book")
	public ModelAndView loadForm()
	{
		ModelAndView mav=new ModelAndView();
		mav.addObject("bookObj", new Book());
		mav.setViewName("BookView");
		return mav;
	}
	
	// method-2 : to handle form submission (POST)
	@PostMapping("/book")
	public ModelAndView handelBookSubmit(Book book)
	{
		System.out.println(book);
		ModelAndView mav= new ModelAndView();
		mav.addObject("msg", "Book saved Successfully...");
		mav.setViewName("success");
		
		return mav;
	}
}
