package Encapsulation_EX;

public class BookDemo4 {
	public static void main(String[] args) {
		Author4 a1 = new Author4("Russel", "Winderand");
		Book4 b1 = new Book4("Developing java structure",a1,75.7);

		System.out.println(a1.toString());
		System.out.println(b1.toString());
	}
}
