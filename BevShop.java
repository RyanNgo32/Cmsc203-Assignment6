
import java.util.ArrayList;
import java.util.List;

public class BevShop implements BevShopInterface
{
	private int MIN_AGE_FOR_AlCOHOL = 21;
	
	private int MAX_ORDER_FOR_ALCOHOL = 3;
	
	private int MIN_TIME = 8;
	
	private int MAX_TIME = 23;
	
	private int MAX_FRUIT = 5;
	
	private List<Order> orders = new ArrayList<Order>(); //create order list 

	public BevShop() // no arg constructor
	{
		orders = new ArrayList<>();
	}
	

	public boolean isValidTime(int time) //between 8 - 23 then return true 
	{
		if(time >= MIN_TIME && time <= MAX_TIME)
		{
			return true;
		}

		return false; //not is false
	}


	public int getMaxNumOfFruits()
	{
		return MAX_FRUIT;
	}

	public int getMinAgeForAlcohol() 
	{
		return MIN_AGE_FOR_AlCOHOL;

	}


	public boolean isMaxFruit(int numOfFruits)
	{
		if(numOfFruits > MAX_FRUIT)
		{
			return true;
		}
		return false;
	}


	public int getMaxOrderForAlcohol() 
	{
		return MAX_ORDER_FOR_ALCOHOL;
	}


	public boolean isEligibleForMore() 
	{
		int numAlcohal = getNumOfAlcoholDrink();
		
		if(numAlcohal < MAX_ORDER_FOR_ALCOHOL)
		{
			return true;
		}
		return false;
	}


	public int getNumOfAlcoholDrink() 
	{
		
		int total = 0;
		
		for(int i = 0; i < orders.size();i++)
		{
			total += orders.get(i).findNumOfBeveType(Type.ALCOHOL);
			
		}
		return total;
	}

	public boolean isValidAge(int age) 
	{
		boolean status = true;
		if(age > MIN_AGE_FOR_AlCOHOL)
		{
			status = true;
		}
		else if(age < MIN_AGE_FOR_AlCOHOL)
		{
			status = false;
		}
		
		return status;
	}


	public void startNewOrder(int time, Day day, String customerName, int customerAge) 
	{
		int orderNum = Order.randomNum(); 
		
		Customer customer = new Customer(customerName,customerAge);
		
		Order newOrder = new Order(orderNum,time,day,customer);
		
		orders.add(newOrder);
		
	}


	public void processCoffeeOrder(String bevName, Size size, boolean extraShot, boolean extraSyrup) 
	{
		getCurrentOrder().addNewBeverage(bevName,size,extraShot,extraSyrup);

		
	}

	
	public void processAlcoholOrder(String bevName, Size size) 
	{
		if(isValidAge(getCurrentOrder().getCustomer().getAge()) && getCurrentOrder().findNumOfBeveType(Type.ALCOHOL) < 3)
		{
			getCurrentOrder().addNewBeverage(bevName, size);
		}
		else if(getCurrentOrder().findNumOfBeveType(Type.ALCOHOL) >= 3)
		{
			System.out.println("You have reached the limit of alcoholic beverages.");
		}
		
	}


	public void processSmoothieOrder(String bevName, Size size, int numOfFruits, boolean addProtein) 
	{
		getCurrentOrder().addNewBeverage(bevName, size, numOfFruits, addProtein);
		
	}

	public int findOrder(int orderNo) 
	{
		for(int i = 0; i < orders.size();i++)
		{
			if(orders.get(i).getOrderNum() == orderNo)
			{
				return i;
			}
			
		}
		return -1;
	}

	public double totalOrderPrice(int orderNo) 
	{
		if(findOrder(orderNo) == -1)
		{
			return 0;
		}
		else 
			return orders.get(findOrder(orderNo)).calcOrderTotal(); // get specific orderNum and calculates total of that order
	}


	public double totalMonthlySale() 
	{
		double total = 0.0;
		
		for(int i = 0; i < orders.size();i++)
		{
			total += orders.get(i).calcOrderTotal();
		}
		
		return total;
	}


	public int totalNumOfMonthlyOrders() 
	{
		return orders.size();
	}

	
	public Order getCurrentOrder() 
	{
		
		int currentIndex = orders.size() - 1; 
		
		return orders.get(currentIndex);
	
	}


	public Order getOrderAtIndex(int index)
	{
		return orders.get(index);
	}

	public String toString()
	{
		String text = " ";
		
		for(int i = 0; i < orders.size();i++)
		{
			text += orders.get(i).toString();
		}
		
		return text;
		
	}
	

	public void sortOrders() 
	{
		int minIndex;
		
		Order temp;
		
		for(int i = 0; i < (orders.size()); i++)
		{
			minIndex = i;
		
			for(int j = i + 1; j < orders.size(); j++)
			{
				if(orders.get(j).compareTo(orders.get(minIndex)) < 0)
				{
					minIndex = j;
				}
			}
			if(minIndex != i)
			{
				temp = orders.get(i);
				orders.set(i, orders.get(minIndex));
				orders.set(minIndex, temp);
			}
		}
	}
}
