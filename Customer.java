
public class Customer 
{
	private String customerName;
	private int age;
	
	public Customer(String customerName, int age) //constructor
	{
		this.customerName = customerName;
		this.age = age;	
	}
	
	public Customer(Customer other) //copy constructor
	{
		other.customerName = customerName;
		other.age = age;
	}
	
	public String toString()
	{
		return "Customer Name: " + customerName + " Age: " + age;
	}
	
	//setters getters 
	
	public void setCustomerName(String customerName)
	{
		this.customerName = customerName;
	}
	public String getCustomerName()
	{
		return customerName;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public int getAge()
	{
		return age;
	}
}
