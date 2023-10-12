package Encapsulation_EX;

public class Customer2_4 {
	private int id, discount;
	private String name;
	
	Customer2_4(int i, String n, int d){
		id = i;
		name = n;
		discount = d;
	}
	
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int d) {
		discount = d;
	}
	
	@Override
	public String toString() {
		return "name: " + name + " discount: " + discount; 
	}
}
