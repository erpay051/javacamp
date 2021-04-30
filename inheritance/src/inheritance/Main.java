package inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ÝndividualCustomer engin = new ÝndividualCustomer();
	engin.customerNumber = "12345";
	
	
	CorporateCustomer hepsiBurada = new CorporateCustomer();
	hepsiBurada.customerNumber = "98765";
	
	SendikaCustomer abc = new SendikaCustomer();
	abc.customerNumber = "99999";
	
	
	CustomerManager customerManager = new CustomerManager();
	
	Customer[] customers = {engin, hepsiBurada, abc};
	
	customerManager.addMultiple(customers);
	
	}

}
