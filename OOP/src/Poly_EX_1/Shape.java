package Poly_EX_1;

public class Shape {
	public void show() {
		System.out.println("Hello");
	}
	public void getInfo() {
		System.out.println(getClass());
	}
	
	public static void main(String[] args) {
		Circle c = new Circle();
		Rectangle r = new Rectangle();
		
		c.getInfo();
		c.show();
		r.getInfo();
		r.show();
	}
}
