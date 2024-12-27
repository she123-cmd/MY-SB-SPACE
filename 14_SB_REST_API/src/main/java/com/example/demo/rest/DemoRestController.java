package com.example.demo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.objenesis.instantiator.basic.NewInstanceInstantiator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

	@GetMapping(value="/msg", produces="text/plain")
	public ResponseEntity<String> getMsg()
	{
		String msg="Welcome Shekhar...";
				return new ResponseEntity<>(msg,HttpStatus.OK);
	}
	@GetMapping("/greet/{name}")
	public String getGreetMsg(@PathVariable("name")String name)
	{
		String msg=name + " Good Morning...";
		
		return msg;
	}
	
	@GetMapping("/welcome")
	public String getWelcomeMsg(@RequestParam("name") String name)
	{
		String msg=name + " Hi welcome...";
		return msg;
	}
}
