package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.example.demo.constants.AppConstants;
import com.example.demo.model.Order;

@Service
public class OrderService {

	@Autowired
	private KafkaTemplate<String, Order> kafkTemplate;
	
	public String CreateOrder(Order order)
	{
	    kafkTemplate.send(AppConstants.TOPIC,order);
	    return "Order created in kafka Topic";
	}
}
