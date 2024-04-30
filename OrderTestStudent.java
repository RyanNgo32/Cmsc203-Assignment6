import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OrderTestStudent {

	Order order;
	
	Customer customer = new Customer("Ryan", 21);
	
	@BeforeEach
	void setUp() throws Exception
	{
		order = new Order(6, Day.MONDAY, customer);
	}

	

	@Test
	public void TestRandomNum()
	{
		int x = Order.randomNum();
		assertTrue(x > 10000 && x < 90000);
	}
	
	@Test
	public void TestIsWeekend()
	{
		assertFalse(order.isWeekend());
	}
	
	@Test
	public void testGetBeverage() {
		Coffee cf = new Coffee("just Coffee", Size.LARGE, false, false);
		Alcohol al = new Alcohol("Tequila", Size.SMALL, false);
		Smoothie sm = new Smoothie("Strawberry Milk", Size.MEDIUM, 0, false);

		order.addNewBeverage("just Coffee", Size.LARGE, false, false);
		order.addNewBeverage("Tequila", Size.SMALL);
		order.addNewBeverage("Strawberry Milk", Size.MEDIUM, 0, false);
		assertTrue(order.getBeverage(0).equals(cf));
		assertTrue(order.getBeverage(1).equals(al));
		assertTrue(order.getBeverage(2).equals(sm));
		
	}

	@Test
	public void testAddNewBeverage() throws NullPointerException {

		

		order.addNewBeverage("Strawberry Milk", Size.SMALL, 3, false);
		assertTrue(order.getBeverage(0).getType().equals(Type.SMOOTHIE));
		order.addNewBeverage("Tequila", Size.LARGE);
		assertTrue(order.getBeverage(1).getType().equals(Type.ALCOHOL));
		order.addNewBeverage("just Coffee", Size.MEDIUM, false, false);
		assertTrue(order.getBeverage(2).getType().equals(Type.COFFEE));
		assertTrue(order.getTotalItems() == 3);

	}

	@Test
	public void testCalcOrderTotal() {
		order.addNewBeverage("just Coffee", Size.MEDIUM, false, false);
		order.addNewBeverage("Tequila", Size.LARGE);
		order.addNewBeverage("Strawberry Milk", Size.SMALL, 3, false);

		assertEquals(9.0, order.calcOrderTotal(), .01);

		

	}

}
