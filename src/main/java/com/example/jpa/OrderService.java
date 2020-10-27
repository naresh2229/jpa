package com.example.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class OrderService {

	@Autowired
	private IOrderRepository repository;
	
	public Order saveOrder(Order order)
	{
	return repository.save(order);
	}
	
}
