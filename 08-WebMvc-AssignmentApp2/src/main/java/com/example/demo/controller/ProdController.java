package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.service.ProdService;

@Controller
public class ProdController {

	private final ProdService prodService;

	public ProdController(ProdService prodService) {
		super();
		this.prodService = prodService;
	}
	
	@GetMapping("/products")
	public String getAllProdcts(Model model)
	{
		model.addAttribute("products", prodService.getAllProducts());
		
		return "products";
		
	}
	
}
