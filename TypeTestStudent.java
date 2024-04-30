import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TypeTestStudent {

	Type type = Type.COFFEE;
	
	
	@Test
	
	public void TestToString()
	{
		assertEquals("COFFEE", type.toString());
	}

}
