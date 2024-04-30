
public abstract class Beverage 
{
	protected String bevName;
	
	protected Type bevType;
	
	protected Size bevSize;
	
	private final double BASE_PRICE = 2.0;
	
	private final double SIZE_PRICE = 0.5;
	
	public double addSizePrice()
	{
		double newPrice = 0.0;
		
		if(bevSize.equals(Size.MEDIUM)) //for medium
		{
			newPrice = BASE_PRICE + SIZE_PRICE;
		}
		else if(bevSize.equals(Size.LARGE)) //for large
		{
			newPrice = BASE_PRICE + 1;
		}
		else if(bevSize.equals(Size.SMALL)) // for small
		{
			newPrice = BASE_PRICE;
		}
		return newPrice;
	}
	
	public Beverage(String bevName, Type bevType, Size bevSize) // beverage constructor
	{
		this.bevName = bevName;
		
		this.bevType = bevType;
		
		this.bevSize = bevSize;
	}
	
	

	public abstract double calcPrice(); //abstract method calcPrice
	
	public String toString() 
	{
		return "Beverage: " + getBevName() + "Size: " + addSizePrice(); //returns name and size
	}
	
	public boolean equals(Object obj)
	{
		Beverage bev1 = (Beverage) obj; //create beverage object with Object obj
		
	
		if (!bev1.getBevName().equals(this.getBevName())) // if bev1 name does not equal calling object 
		{
			return false; //return false
		}
		
		if(!bev1.getType().equals(this.getType())) // if bev1 type does not equal calling object 
		{
			return false; //return false
		}
		
		if(!bev1.getBevSize().equals(this.getBevSize())) // if bev1 Size does not equal calling object 
		{
			return false; //return false 
		}
		
		
		
		return true; //returns true if if statements dont return false
	}
	
	//setters getters
	
	public void setBevName(String bevName)
	{
		this.bevName = bevName;
		
	}
	
	public void setBevType(Type bevType)
	{
		this.bevType = bevType;
	}
	
	public void setBevSize(Size bevSize)
	{
		this.bevSize = bevSize;
	}
	
	public String getBevName()
	{
		return bevName;
	}
	
	public Type getType()
	{
		return bevType;
	}
	
	public Size getBevSize()
	{
		return bevSize;
	}
}
