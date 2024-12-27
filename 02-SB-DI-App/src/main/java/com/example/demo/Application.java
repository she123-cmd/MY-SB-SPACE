package com.example.demo;

import java.io.ObjectInputFilter.Config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.Dao.*;
import com.example.demo.Service.UserService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt=SpringApplication.run(Application.class, args);
		//System.out.println(ctxt.getClass().getName());
		//System.out.println(ctxt.getBeanDefinitionCount());
		
		UserService service=ctxt.getBean(UserService.class);
		service.getName(100);
		//System.out.println(name);
	}
 
}
