
public class Smoothie extends Beverage
{
	protected int fruitNum;
	
	protected boolean addProtein;
	
	public Smoothie(String bevName, Size bevSize, int fruitNum, boolean addProtein)
	{
		super(bevName, Type.SMOOTHIE, bevSize);
		this.fruitNum = fruitNum;
		this.addProtein = addProtein;
	}
	
	public String proteinAdded()
	{
		String text = " ";
		
		if(addProtein == false)
		{
			text += "No Protein Added.";
		}
		
		if(addProtein == true)
		{
			text += "Protein Added";
		}
		return text;
	}
	
	public double calcPrice()
	{
		double price = addSizePrice();
		
		if(fruitNum > 0)
		{
			price += fruitNum * .5;
		}
		if(addProtein == true)
		{
			
			price += 1.5;
		}
		
		return price;
	}
	
	public String toString()
	{
		return "Name: " + getBevName() + "Size: " + getBevSize() + "Protein Added: " + proteinAdded() + " Number of Fruits: " + getFruitNum() + " Price: " + calcPrice(); 
	}
	
	public boolean equals(Object obj)
	{
		Smoothie bev1 = (Smoothie) obj; //type cast taking object passing in changing to coffee type
		
		if (!bev1.getBevName().equals(this.getBevName())) // if bev1 name does not equal calling object 
		{
			return false; //return false
		}
		
		if(!bev1.getType().equals(this.getType())) // if bev1 type does not equal calling object 
		{
			return false; //return false
		}
		
		if(!bev1.getBevSize().equals(this.getBevSize()))  // if bev1 Size does not equal calling object 
		{
			return false; //return false 
		}
		
		if(!(bev1.getFruitNum() == (this.getFruitNum())))
		{
			return false;
		}
		
		if(!(bev1.getAddProtein() == (this.getAddProtein())))
		{
			return false;
		}
		
		
			return true; //returns true if if statements dont return false
	}
	
	//setters getters 
	
	public void setAddProtein(boolean addProtein)
	{
		this.addProtein = addProtein;
	}
	public boolean getAddProtein()
	{
		return addProtein;
	}
	
	public void setFruitNum(int fruitNum)
	{
		this.fruitNum = fruitNum;
	}
	
	public int getFruitNum()
	{
		return fruitNum;
	}
}
