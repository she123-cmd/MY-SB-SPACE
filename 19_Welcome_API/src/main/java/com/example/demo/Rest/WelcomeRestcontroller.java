package com.example.demo.Rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestcontroller {

	@Autowired
	private Environment env;
	
	@GetMapping("/message")
	public String getMsg()
	{
		String port=env.getProperty("server.port");
		String msg="Hi Welcome...("+port+")";
		return msg;
	}
	
}
