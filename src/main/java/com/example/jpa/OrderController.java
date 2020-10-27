package com.example.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/order")
public class OrderController {

	
	//@Autowired
	//RestTemplate resttemplate;
	
	@Autowired
	OrderService service;
	
	//@Value("${microservice.paymentservice-endpoints.endpoint.uri}")
	//private String ENDPOINTURL;
	
	
	@PutMapping("/bookOrder")
	public Order bookOrder(Order order)
	
	{
		/*
		 * System.out.println("hello"); String uri="http://PAYMENT-SERVICE1/payment";
		 * String uri1=ENDPOINTURL; String result = resttemplate.getForObject(uri,
		 * String.class); System.out.println(result);
		 */
		
		return service.saveOrder(order);
		//return "Hello"+""+result;
	}
	
}
