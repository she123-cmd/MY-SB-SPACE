package com.example.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankRestController {

	@GetMapping("/about")
	public String about()
	{
		return "we are since 1999...";
	}
	
	@GetMapping("/contact")
	public String ContactUS()
	{
		return "plz contact at 6867896";
	}
	
	@GetMapping("/deposit")
	public String deposit()
	{
		return "deposit successful...";
	}
	
	@GetMapping("/withdraw")
	public String withdraw()
	{
		return "withdraw successful...";
	}
}
