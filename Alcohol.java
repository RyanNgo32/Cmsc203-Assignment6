
public class Alcohol extends Beverage
{
	protected boolean onWeekends;
	
	public Alcohol(String bevName, Size bevSize, boolean onWeekends)
	{
		super(bevName,Type.ALCOHOL,bevSize);
		this.onWeekends = onWeekends;
	}
	
	public String weekends()
	{
		String text = " ";

		if(onWeekends = true)
		{
			text += "Yes Offered";
		}
		if(onWeekends = false)
		{
			text += "Not Offered";
		}
		
		return text;
	}
	
	public double calcPrice()
	{
		double price = addSizePrice();
		if(onWeekends == true)
		{
			price += .6;
		}
		
		return price;
	}
	
	public boolean equals(Object obj)
	{
		Alcohol bev1 = (Alcohol) obj; //type cast taking object passing in changing to coffee type
		
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
		
		if(!(bev1.getOnWeekends() == this.getOnWeekends()))
		{
			return false;
		}
		
			return true; //returns true if if statements dont return false
	}
	
	public String toString()
	{
		return "Name: "  + getBevName() + "Size: " + getBevSize() + " Offered on Weekends: " + weekends() + " Price: " + calcPrice();
	}
	
	
	//getters setters
	
	public void setOnWeekends(boolean onWeekends)
	{
		this.onWeekends = onWeekends;
	}
	
	public boolean getOnWeekends()
	{
		return onWeekends;
	}
	
}
