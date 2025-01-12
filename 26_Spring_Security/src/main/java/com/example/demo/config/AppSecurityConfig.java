package com.example.demo.config;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.jaas.memory.InMemoryConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class AppSecurityConfig {

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception
	{
		http.authorizeHttpRequests((req)->req
				.requestMatchers("/about","/contact").permitAll()
				.anyRequest()
				.authenticated())
		        .formLogin();
		 return http.build();
	}
	
	@Bean
	public InMemoryUserDetailsManager inMesmuser()
	{
		UserDetails u1=org.springframework.security.core.userdetails.User.withDefaultPasswordEncoder()
				.username("shekhar")
				.password("abc@123")
				.roles("admin")
				.build();
		
		
		UserDetails u2=org.springframework.security.core.userdetails.User.withDefaultPasswordEncoder()
				.username("nikhil")
				.password("abc@123")
				.roles("user")
				.build();
		
		return new InMemoryUserDetailsManager(u1,u2);
	}
}
