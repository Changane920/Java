package Encapsulation_EX;

public class Book2 {
	private Author2 author;
	private String bname;
	private int qty = 0;
	private double price;

	public Author2 getAuthor() {
		return author;
	}
	public void setAuthor(Author2 author) {
		this.author = author;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	Book2(String b, int q, double p, Author2 a){
		this.author = a;
		this.bname = b;
		this.qty = q;
		this.price = p;
	}
	
	@Override
	public String toString() {
		return "Book [name = " + bname + ",(" + author.toString() + "),price = " + price + ", quantity = " + qty +"]";
	}
	
	//main 
	public static void main(String[] args) {
		Author2 a1 = new Author2("Author1","author1@email.com",'m');
		Book2 b1 = new Book2("Book1",2,100,a1);
		
		System.out.println(a1);
		System.out.println(b1);
	}
}
