package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.service.EmpService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context=SpringApplication.run(Application.class, args);
		
		EmpService emp=context.getBean(EmpService.class);
		
		//emp.saveEmployee();
		emp.saveEmps();
	}

}
