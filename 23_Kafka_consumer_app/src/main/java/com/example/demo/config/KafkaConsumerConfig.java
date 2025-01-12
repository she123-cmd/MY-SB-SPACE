package com.example.demo.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.codec.StringDecoder;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.support.serializer.JsonDeserializer;

import com.example.demo.constants.AppConstants;
import com.example.demo.model.Order;
import com.fasterxml.jackson.databind.JsonSerializable;

@Configuration
public class KafkaConsumerConfig {

	@Bean
	public ConsumerFactory<String, Order> consumerFactory()
	{
		Map<String, Object> configProps =new HashMap<String,Object>();
		
		configProps.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, AppConstants.HOST);
		configProps.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
		configProps.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG,JsonDeserializer.class);
		configProps.put(JsonDeserializer.TRUSTED_PACKAGES, "*"); 
		
		return new DefaultKafkaConsumerFactory<>(configProps,
		        new StringDeserializer(),
		        new JsonDeserializer<>(Order.class));
	}
	
	@Bean
	public ConcurrentKafkaListenerContainerFactory<String, Order> kafkaListnerFactory()
	{
		ConcurrentKafkaListenerContainerFactory<String, Order> factory=new ConcurrentKafkaListenerContainerFactory<>();
		factory.setConsumerFactory(consumerFactory());
		return factory;
	}
	
	
	
	
	
	
	
	
}
