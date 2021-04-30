package oopIntro;

public class Product {

	private int Id;
	private String name;
	private double unitPrace;
	private String detail;
	private double discount;
	

	public Product () 
		{	
	
		}


	
	
	public Product (int Id, String name, double unitPrace, String detail, double discount) 
	{
		 
		this.Id = Id;
		this.name = name;
		this.unitPrace = unitPrace;
		this.detail = detail;
		this.discount = discount;
		
		
	
	}


	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getUnitPrace() {
		return unitPrace;
	}


	public void setUnitPrace(double unitPrace) {
		this.unitPrace = unitPrace;
	}


	public String getDetail() {
		return detail;
	}


	public void setDetail(String detail) {
		this.detail = detail;
	}


	public double getDiscount() {
		return discount;
	}


	public void setDiscount(double discount) {
		this.discount = discount;
	}


	public double getUnitPraceAfterDiscount() {
		return this.unitPrace - (this.unitPrace * this.discount / 100);
	}	

	

}
