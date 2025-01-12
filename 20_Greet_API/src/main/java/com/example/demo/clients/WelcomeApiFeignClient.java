package com.example.demo.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value="Welcome-API")
public interface WelcomeApiFeignClient {
	
	@GetMapping("/message")
	public String invokeWelcomeApi();

}
