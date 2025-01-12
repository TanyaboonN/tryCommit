package model;

public class Drink {

	private int id;
	private String name;
	private int price;

	public Drink(int id, String name, int price) { // constructor method
		this.id = id;
		this.name = name;
		this.price = price;

	}
	
	public Drink() {
	
	}
	
	public int getID() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override 
	public String toString() {
		return "Drink[id= " + id +", name= " + name +", price= " + price + " ]";
		
	}
}
