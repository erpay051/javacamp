package inheritance;

public class CustomerManager {
	
	public void add (Customer customer) 
	{
		System.out.println("Kaydedildi : " + customer.customerNumber);
	}

	public void addMultiple (Customer[] customers) 
	{
		for (Customer customer : customers) 
		{
			add(customer);
		}
	}

}
