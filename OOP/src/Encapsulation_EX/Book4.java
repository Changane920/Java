package Encapsulation_EX;

public class Book4 {
	private String title, author;
	private double price;
	
	public Book4(String t, Author4 a, double p) {
		this.title = t;
		this.author = a.toString();
		this.price = p;
	}
	
	public void setTitle(String t) {
		this.title = t;
	}
	public void setAuthor(Author4 a) {
		this.author = a.toString();
	}
	public void setPrice(double p) {
		this.price = p;
	}
	
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public double getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return "Book's title: " + title + " " + author + " Price: " + price;
	}
}

