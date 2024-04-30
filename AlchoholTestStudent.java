import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AlchoholTestStudent{

	
	Alcohol alcohol;
	
	@BeforeEach
	public void setUp() throws Exception 
	{
		alcohol = new Alcohol("Whiskey", Size.LARGE,true);
	}
	
	@Test
	public void testWeekends()
	{
		assertEquals(" Yes Offered", alcohol.weekends());
		
	}
	
	@Test
	public void testCalcPrice()
	{
		assertEquals(3.6, alcohol.calcPrice(),.01);
	}
	@Test
	public void testEquals()
	{
		Alcohol alcoholCopy = new Alcohol("Whiskey", Size.LARGE,true);
		assertTrue(alcohol.equals(alcoholCopy));
		
	}
	@Test
	public void testToString()
	{
		assertEquals("Name: WhiskeySize: LARGE Offered on Weekends:  Yes Offered Price: 3.0", alcohol.toString());
	}
}
