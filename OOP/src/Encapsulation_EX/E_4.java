package Encapsulation_EX;

public class E_4 {
	public static void main(String[] args) {
		InvoiceItem item = new InvoiceItem("001","Milk",2,100);		
		InvoiceItem item2 = new InvoiceItem("002","Nabati",3,1500);
		InvoiceItem item3 = new InvoiceItem("A101","Pen Red",888,0.08);
		
		System.out.println(item);
		System.out.println(item2);
		System.out.println(item3);
		item3.setQty(999);
		item3.setUnitPrice(0.99);
		System.out.println(item3);
		System.out.println("id is " + item3.getId());
		System.out.println("desc is " + item3.getDesc());
		System.out.println("Qty is " + item3.getQty());
		System.out.println("UnitPrice is " + item3.getUnitPrice());
		System.out.println("Total " + item3.getTotal());
	}
}
class InvoiceItem{
	private String id, desc;
	private int qty;
	private double unitPrice;
	
	public String getId() {
		return id;
	}
	public String setId(String ID) {
		return this.id = ID;
	}
	public String getDesc() {
		return desc;
	}
	public String setDesc(String Desc) {
		return this.desc = Desc; 
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int Qty) {
		this.qty = Qty;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double UnitPrice) {
		this.unitPrice = UnitPrice; 
	}

	InvoiceItem(String i, String d, int q, double u){
		this.id = i;
		this.desc = d;
		this.qty = q;
		this.unitPrice = u;
	}
	
	double getTotal() {
		return getUnitPrice() * getQty();
	}

	public String toString() {
		return "Invoice Item [ Id = " + getId() + "/Description : " + getDesc() + "/Quantity: " + getQty() + "/UnitPrice: " + getUnitPrice() + "/Total: " + getTotal() + " ]";
	}
}
