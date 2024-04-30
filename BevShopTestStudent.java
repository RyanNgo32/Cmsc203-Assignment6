import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BevShopStudentTest
{
	BevShop bevShop;
	
	@BeforeEach
	void setUp() throws Exception 
	{
		bevShop = new BevShop();
	}
	
	
	@Test
	public void TestIsValidTime()
	{
		assertTrue(bevShop.isValidTime(15));
		assertFalse(bevShop.isValidTime(3));
		
	}

	
	@Test
	public void TestIsMaxFruit()
	{
		assertTrue(bevShop.isMaxFruit(8));
		assertFalse(bevShop.isMaxFruit(2));
	}
	
	@Test
	public void TestIsEligibleForMore()
	{
		bevShop.startNewOrder(11, Day.MONDAY, "Ryan", 29); 
		bevShop.processAlcoholOrder("Tequila",Size.MEDIUM); 
		assertTrue(bevShop.isEligibleForMore());
	}
	
	@Test
	public void TestGetNumOfAlcoholDrink() 
	{
		bevShop.startNewOrder(9, Day.FRIDAY, "Gessiupe",62); //ryan
		bevShop.processAlcoholOrder("Cornball",Size.LARGE); 
		assertEquals(1, bevShop.getNumOfAlcoholDrink());
	}
	
	@Test
	public void TestIsValidAge() 
	{
		assertTrue(bevShop.isValidAge(23));
		assertFalse(bevShop.isValidAge(12));
	}
	
	@Test
	public void TestStartNewOrder()  
	{
		bevShop.startNewOrder(14, Day.WEDNESDAY, "Franco", 23);
	}
	
	@Test
	public void TestProcessCoffeeOrder()   
	{
		bevShop.startNewOrder(13, Day.TUESDAY,"lois",19);
		bevShop.processCoffeeOrder("Black coffee", Size.MEDIUM, true, false);
		assertEquals(1, bevShop.getCurrentOrder().findNumOfBeveType(Type.COFFEE));
	}
	
	@Test
	public void TestProcessAlcoholOrder()
	{
		bevShop.startNewOrder(16, Day.MONDAY,"Chelsea",21);
		bevShop.processAlcoholOrder("Fireball", Size.MEDIUM);
		assertEquals(1, bevShop.getCurrentOrder().findNumOfBeveType(Type.ALCOHOL));
	}
	
	@Test
	public void TestProcessSmoothieOrder() 
	{
		bevShop.startNewOrder(16, Day.MONDAY,"Chelsea",35);
		bevShop.processSmoothieOrder("Banana Shake", Size.MEDIUM, 2, true);
		assertEquals(1, bevShop.getCurrentOrder().findNumOfBeveType(Type.SMOOTHIE));
	}
	
	
	@Test
	public void TestTotalOrderPrice()
	{
		bevShop.startNewOrder(12, Day.TUESDAY, "Lawrence", 43);
		bevShop.processSmoothieOrder("Shake", Size.SMALL,2,false);
		assertEquals(3, bevShop.getCurrentOrder().calcOrderTotal(),.01);
	}
	
	@Test
	public void TestTotalMonthlySale() 
	{
		bevShop.startNewOrder(11, Day.MONDAY, "Billy", 67);
		bevShop.processCoffeeOrder("Espresso", Size.LARGE,false,true);
		assertEquals(3.5, bevShop.totalMonthlySale(),.01);
	}
	
	@Test
	public void TestTotalNumOfMonthlyOrders() 
	{
		bevShop.startNewOrder(9, Day.FRIDAY, "Clarence", 25);
		bevShop.processCoffeeOrder("Latte", Size.LARGE,false,true);
		bevShop.processCoffeeOrder("Decaf", Size.SMALL,false,false);
		assertEquals(2,bevShop.getCurrentOrder().findNumOfBeveType(Type.COFFEE));
		
	}

	
	@Test 
	public void TestToString()
	{
		bevShop.startNewOrder(14, Day.THURSDAY, "Chloe", 21);
		bevShop.processCoffeeOrder("Matcha", Size.SMALL,false,false);
		//assertEquals("", bevShop.toString()); random order number not possible?
	}
	
	@Test
	public void testGetMaxOfFruits()
	{
		assertEquals(5, bevShop.getMaxNumOfFruits());
	}
}
