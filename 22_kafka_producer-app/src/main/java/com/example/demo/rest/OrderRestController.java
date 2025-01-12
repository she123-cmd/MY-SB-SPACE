package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.constants.AppConstants;
import com.example.demo.model.Order;
import com.example.demo.service.OrderService;

@RestController
public class OrderRestController {

	@Autowired
	private OrderService orderService;
	
	@PostMapping("/order")
	public String placeOrder(@RequestBody Order order)
	{
		String msg=orderService.CreateOrder(order);
		return msg;
	}
}
