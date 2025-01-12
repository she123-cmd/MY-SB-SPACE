package com.example.demo.Repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.clients.WelcomeApiFeignClient;

@RestController
public class GreetController {

	
	@Autowired
	private WelcomeApiFeignClient welcomeClient;

	@Autowired
	private Environment env;
	
	
	@GetMapping("/Greet")
	public String getGreet()
	{
		String welcomeResp = welcomeClient.invokeWelcomeApi();

		String port = env.getProperty("server.port");

		String greetResp = "Good Morning (" + port + "), ";

		return greetResp + welcomeResp;
	}
}
