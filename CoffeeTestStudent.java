import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CoffeeTestStudent {

	Coffee coffee;
	
	@BeforeEach
	public void setUp() throws Exception 
	{
		coffee = new Coffee("Coffee", Size.SMALL,true,false);
	}
	
	
	@Test
	public void testCalcPrice()
	{
		assertEquals(2.5, coffee.calcPrice(),.01);
	}
	@Test
	public void testEquals()
	{
		Coffee coffeeCopy = new Coffee("Coffee", Size.SMALL,true,false);
		assertTrue(coffee.equals(coffeeCopy));
		
	}
	@Test
	public void testToString()
	{
		assertEquals("Name: CoffeeSize: SMALLExtra Shots: trueExtra Syrup: false Price: 2.5", coffee.toString());
	}
}
