
public class Coffee extends Beverage
{
	protected boolean addExtraShot;
	
	protected boolean addExtraSyrup;
	
	public Coffee(String bevName, Size bevSize, boolean addExtraShot, boolean addExtraSyrup)
	{
		super(bevName, Type.COFFEE, bevSize);
		this.addExtraShot = addExtraShot;
		this.addExtraSyrup = addExtraSyrup;
	}
	
	
	public String toString()
	{
		return "Name: " + getBevName() + "Size: " + getBevSize() + "Extra Shots: " + addExtraShot + "Extra Syrup: " + addExtraSyrup + " Price: " + calcPrice();
	}
	
	public double calcPrice()
	{
		double price = addSizePrice();
		
		if(addExtraShot == true)
		{
			price += .5;
		}
		if(addExtraSyrup == true)
		{
			price += .5;
		}
		
		return price;
	}
	
	public boolean equals(Object obj)
	{
		Coffee bev1 = (Coffee) obj; //type cast taking object passing in changing to coffee type
		
	
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
		
		if(bev1.getAddExtraShot() != this.getAddExtraShot())
		{
			return false; 
		}
		
		if(bev1.getAddExtraSyrup() != this.getAddExtraSyrup())
		{
			return false;
		}
		
			return true; //returns true if if statements dont return false
	}
	
	//getters and setters
	
	public void setAddExtraShot(boolean addExtraShot)
	{
		this.addExtraShot = addExtraShot;
	}
	
	public boolean getAddExtraShot()
	{
		return addExtraShot;
	}
	
	public void setAddExtraSyrup(boolean addExtraSyrup)
	{
		this.addExtraSyrup = addExtraSyrup;
	}
	
	public boolean getAddExtraSyrup()
	{
		return addExtraSyrup;
	}
}
