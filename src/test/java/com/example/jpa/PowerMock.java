package com.example.jpa;

import org.junit.runner.RunWith;

@RunWith(PowerMockRunner.class)
@PrepareForTest(FullyQualifiedClassName)
public class PowerMock {

	
	@InjectMocks
	private OrderService servive;
	
	@Before
	public void init()
	{
	MockitoAnnotation.intMocks(NotificationUtil.class);
	}
	
	public void testStaticMethos() {
		//GIven
		String email="h@gmail.com";
		
		//When
		when(Notification.sendEmail(emailid).thenReturn("success"));
		//Then
		Order o=new Order("klsdkfl");
	}
}
