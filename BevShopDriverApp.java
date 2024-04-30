import java.util.Scanner;

public class BevShopDriverApp
{
	public static void main(String args[])
	{
		final int time = 9;
		
		final Day day = Day.TUESDAY;
		
		BevShop bevShop = new BevShop();
		
		System.out.println("The current order in process can have only 3 alcholic beverages.");
		System.out.println("The minimum age to order alcohol drink is 21.");
		System.out.println("Start a new order: ");
		
		
		System.out.println("Enter your name: ");
		
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.nextLine();
		
		System.out.println("Enter your age: ");
		
		int age = scanner.nextInt();
		
		scanner.close();
		
		
		System.out.println("Start Please a new Order: ");
		
		bevShop.startNewOrder(time,day,name,age);
		
		System.out.println(bevShop.getCurrentOrder().toString());
		
		System.out.println("Total Price: " + bevShop.totalOrderPrice(0) + "\n");
		
		
		
		bevShop.processCoffeeOrder("Coffee1", Size.MEDIUM,true,false);
		bevShop.processAlcoholOrder("Alcohol1",Size.LARGE);
		bevShop.processAlcoholOrder("Alcohol2",Size.SMALL);
		bevShop.processAlcoholOrder("Alcohol3",Size.SMALL);
		bevShop.processSmoothieOrder("Smoothie1",Size.MEDIUM,4,false);
		
		System.out.println(bevShop.getCurrentOrder().toString());
		
		
		System.out.println("Total items on your order is " + bevShop.getCurrentOrder().getTotalItems());
		System.out.println("Total price on your order is " + bevShop.getCurrentOrder().calcOrderTotal());
		
		
		
		
		System.out.println("Programmer: Ryan Ngo");
	}
}
