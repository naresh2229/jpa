package com.example.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	//@Autowired
	//private RestTemplate rest;
	RestTemplate restTemplate = new RestTemplate();
	 
    String result = restTemplate.getForObject("https://api.bnsf.com:6443/v1/units", String.class);
    
    

	
}
