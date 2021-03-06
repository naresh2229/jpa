package com.example.jpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

//import com.example.springjenkins.SpringJenkinsApplicationTests;

@SpringBootApplication
public class JpaApplication {
	public static Logger  logger=LoggerFactory.getLogger(JpaApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
		logger.info("SUcessfully jenkins applied");
	}

	//@Autowired
	//private RestTemplate rest;
	//RestTemplate restTemplate = new RestTemplate();
	 
  //  String result = restTemplate.getForObject("https://api.bnsf.com:6443/v1/units", String.class);
    
    

	
}
