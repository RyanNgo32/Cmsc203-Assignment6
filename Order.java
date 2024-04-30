import java.util.ArrayList;
import java.util.Random;

public class Order implements OrderInterface
{
	private int orderNum;
	
	private int time;
	
	private Day day;
	
	private Customer customer;
	
	ArrayList<Beverage> beverages = new ArrayList<Beverage>(); // beverage array list
	
	public static int randomNum() //generates random number 
	{
		Random randomNum = new Random(); //random object
		
		int number = randomNum.nextInt(80001) + 10000;	//number in between 10000 - 90000	
		
		return number; //returns
	}
	
	public Order(int orderNum, int time, Day day, Customer customer) //constructor
	{
		this.orderNum = orderNum;
		this.time = time;
		this.day = day;
		this.customer = customer;
	}
	
	
	

	public Order(int time, Day tuesday, Customer customer2) 
	{
		orderNum = randomNum();
		
		this.time = time;
		
		this.day = tuesday;
		
		this.customer = customer2;
	}


	public boolean isWeekend()  // if on weekend return true 
	{
		if(day.equals(Day.SATURDAY) || day.equals(Day.SUNDAY))
		{
			return true;
		}
		else
			return false; //not returns false
	}


	public Beverage getBeverage(int itemNo) 
	{
		return beverages.get(itemNo); //returns beverage item number
	}


	public void addNewBeverage(String bevName, Size size, boolean extraShot, boolean extraSyrup)  //overloaded Coffee
	{
		beverages.add(new Coffee(bevName,size,extraShot,extraSyrup)); //adds new Coffee object to beverages list
		
	}


	public void addNewBeverage(String bevName, Size size)  //overloaded alcohol
	{
		beverages.add(new Alcohol(bevName,size,isWeekend())); //adds new alcohol object to beverages list 
	}


	public void addNewBeverage(String bevName, Size size, int numOfFruits, boolean addProtein) //overloaded Smoothie
	{
		beverages.add(new Smoothie(bevName,size,numOfFruits,addProtein)); //adds new smoothie object to beverages list 
	}


	public double calcOrderTotal() 
	{
		double total = 0.0;
		
		for(int i = 0; i < beverages.size(); i++)
		{
			total += beverages.get(i).calcPrice();
		}
		
		return total;
	}


	public int findNumOfBeveType(Type type) 
	{
		int total = 0;
		
		for(int i = 0; i < beverages.size();i++)
		{
			if(beverages.get(i).getType() == type)
			{
				total++;
			}
		}
		return total;
	}
	
	public int compareTo(Order obj)
	{
		int num = 0;
		
		if(obj.getOrderNum() == this.getOrderNum())
		{
			num = 0;
		}
		else if(obj.getOrderNum() > this.getOrderNum())
		{
			num = 1;
		}
		
		else if(obj.getOrderNum() < this.getOrderNum())
		{
			num = -1;
		}
		
		return num;
	}
	
	
	public String toString()
	{
		StringBuilder text = new StringBuilder();
		
		text.append("Order Number: " + getOrderNum()).append(" Time: " + getTime()).append(" Day: " + getDay())
		.append(" Customer Name: " + getCustomer().getCustomerName()).append(" Age: " + getCustomer().getAge()).append("\n");
		

		
		for(int i = 0; i < beverages.size();i++)
		{
			text.append(beverages.get(i).toString() + "\n");
		}
		
		return text.toString();
	}
	
	
	public int getTotalItems()
	{
		return beverages.size();
	}
	
	
	 
	
	//getters setters
	
	public void setOrderNum(int orderNum)
	{
		this.orderNum = orderNum;
	}
	
	public void setTime(int time)
	{
		this.time = time;
	}
	
	public void setDay(Day day)
	{
		this.day = day;
	}
	
	public void setCustomer(Customer customer)
	{
		this.customer = customer;
	}
	
	public int getOrderNum()
	{
		return orderNum;
	}
	
	public int getTime()
	{
		return time;
	}
	
	public Day getDay()
	{
		return day;
	}
	
	public Customer getCustomer()
	{
		return customer;
	}

	public ArrayList<Beverage> getBeverages()
	{
		return beverages;
	}
	
}
