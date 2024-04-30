import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DayTestStudent {

	Day day = Day.MONDAY;
	
	
	@Test
	
	public void TestToString()
	{
		assertEquals("MONDAY", day.toString());
	}
	
}
