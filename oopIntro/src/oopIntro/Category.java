package oopIntro;

public class Category {

	private int Id;
	private String name;
	
	public Category() 
	{
		
	}
	
	public Category(int Id,String name)
	{
		this();
		this.Id = Id;
		this.name = name;
	}
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name + "!";
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
