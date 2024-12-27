package com.example.demo;

import org.springframework.boot.SpringApplication;



import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.service.EmpService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		//SpringApplication.run(Application.class, args);
		
		ConfigurableApplicationContext context =
				SpringApplication.run(Application.class, args);
		
		EmpService empservice=context.getBean(EmpService.class);
		
		//empservice.getAllEmps();
		
		//empservice.getAllEmpssort();
		//empservice.getAllEmpsPagination();
		
		empservice.getAllEmpsWithFilter();
		

		
	}

}
