import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CustomerTestStudent {

	Customer customer;
	
	@BeforeEach
	public void setUp() throws Exception 
	{
		customer = new Customer("Ryan", 21);
	}
	
	
	@Test
	public void testToString()
	{
		assertEquals("Customer Name: Ryan Age: 21", customer.toString());
	}

}
