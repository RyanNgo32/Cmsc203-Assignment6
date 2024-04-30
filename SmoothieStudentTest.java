import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SmoothieStudentTest {

	Smoothie smoothie;
	
	@BeforeEach
	public void setUp() throws Exception 
	{
		smoothie = new Smoothie("Smoothie", Size.MEDIUM,2,false);
	}
	
	
	@Test
	public void testCalcPrice()
	{
		assertEquals(3.5, smoothie.calcPrice(),.01);
	}
	@Test
	public void testEquals()
	{
		Smoothie smoothieCopy = new Smoothie("Smoothie", Size.MEDIUM,2,false);
		assertTrue(smoothie.equals(smoothieCopy));
		
	}
	@Test
	public void testToString()
	{
		assertEquals("Name: SmoothieSize: MEDIUMProtein Added:  No Protein Added. Number of Fruits: 2 Price: 3.5", smoothie.toString());
	}	

}
