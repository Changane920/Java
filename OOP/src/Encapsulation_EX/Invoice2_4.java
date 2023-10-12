package Encapsulation_EX;

public class Invoice2_4 {
	private int id;
	private Customer2_4 customer;
	private double amount;
	
	Invoice2_4(int i, Customer2_4 c, double a){
		id = i;
		customer = c;
		amount = a;
	}
	
	public int getId() {
		return id;
	}
	public Customer2_4 getCustomer() {
		return customer;
	}
	public void setCustomer(Customer2_4 c) {
		customer = c;
	}
	public int getCustomerId() {
		return customer.getId();
	}
	public String getCustomerName() {
		return customer.getName();
	}
	public int getCustomerDiscount() {
		return customer.getDiscount();
	}
	public double getAmountAfterDiscount() {
		double temp = getCustomerDiscount();
		amount -= (temp / 100) * amount ;
		return amount;
	}
	public String toString() {
		return "Invoice[id = " + id + ", customer (name = " + getCustomerName() + ", customer id = " + getCustomerId() + ", discount = " + getCustomerDiscount() + "), amount = " + getAmountAfterDiscount() + "]"; 
	}
	
	public static void main(String[] args) {
		Customer2_4 c1 = new Customer2_4(2,"Chan",5);
		Invoice2_4 in1 = new Invoice2_4(1,c1,500);

		System.out.println(in1);
	}
}
