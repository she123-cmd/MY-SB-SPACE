package com.example.demo.rest;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.binding.Customer;

import ch.qos.logback.core.status.Status;

@RestController
public class CustomerRestController {

	@PostMapping("/customer")
	public ResponseEntity<String> createCustomer(@RequestBody Customer c)
	{
		System.out.println(c);
		return new ResponseEntity<String>("product saved", HttpStatus.CREATED);
		
	}
	
	
	@GetMapping(value="/customer", produces="application/json")
	public ResponseEntity<Customer> getCustomer()
	{
		Customer c1=new Customer(101,"shekhar","shekhar@gmail.com");
		
		return new ResponseEntity<>(c1, HttpStatus.OK);
	}
	
	@GetMapping(value="/customers", produces="application/json")
	public ResponseEntity<List<Customer>> getCustomers()
	{
		Customer c1=new Customer(101,"shekhar","shekhar@gmail.com");
		Customer c2=new Customer(102,"Nikhil","Nikhil@gmail.com");
		Customer c3=new Customer(103,"Nik","Nik@gmail.com");
		List<Customer>List = Arrays.asList(c1,c2,c3);
		
		return new ResponseEntity<>(List,HttpStatus.OK);
	}
}
