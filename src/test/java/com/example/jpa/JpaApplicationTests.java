package com.example.jpa;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class JpaApplicationTests {

	@Autowired
	private OrderService service;
	
	@MockBean
	private IOrderRepository rep;
	
	@Test
	public void saveOrder1()
	{
		Order o=new Order(1,"s",5,3);
		when(rep.save(o)).thenReturn(o);
		assertEquals(o, service.saveOrder(o));
	}

	/*
	 * @Test public void findByAll() { when(rep.findAll()).thenReturn(Stream.of(new
	 * Order())) assertEquals(2,service.findAll().size()) }
	 * 
	 * @Test public void delete() { //in the service class if return type is void
	 * Order o=new Order(1,"s",5,3); service.delete(o);
	 * verify(rep.times(1).delete(o)); }
	 */
}
