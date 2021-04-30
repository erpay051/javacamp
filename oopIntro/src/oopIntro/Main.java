package oopIntro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Product product1 = new Product(1,"Lenova v14",15000,"16 GB Ram",10 );
	
	
	
	Product product2 = new Product();
	product2.setId(2);
	product2.setName("Lenovo v15");
	product2.setUnitPrace(16000);
	product2.setDetail("32 GB Ram");
	product2.setDiscount(10);
	
	System.out.println(product2.getUnitPraceAfterDiscount());
	
	Category category1 = new Category((1), ("Yiyecek"));
	Category category2 = new Category((2), ("Ýçecek"));
	
	
	System.out.println(category1.getName());
	System.out.println(category2.getName());
		
	
		

		
	
	
	
	
	}

}
