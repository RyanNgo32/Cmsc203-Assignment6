import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SizeTestStudent {

	Size size = Size.LARGE;
	
	
	@Test
	
	public void TestToString()
	{
		assertEquals("LARGE", size.toString());
	}

}
