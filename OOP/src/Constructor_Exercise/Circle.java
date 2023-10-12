package Constructor_Exercise;

public class Circle {
	double radius;
	Circle(){
		radius = 1;
	}
	Circle(double num){
		radius = num;
	}
	double getArea() {
		return Math.PI * (radius * radius);
	}
	@Override
	public String toString() {
		return "radius: " + radius + "\tArea: " + getArea();
	}
	void Display() {
		System.out.println("Display radius: " + radius + "\tDisplay Area: " + getArea());
	}
	
	public static void main(String[] args) {
		Circle c = new Circle();
		System.out.println(c.toString());
		c.Display();
		Circle c1 = new Circle(2.0);
		System.out.println(c1.toString());
		Circle c2 = new Circle(12);
		System.out.println(c2.toString());
		Circle c3 = new Circle(24);
		System.out.println(c3.toString());
	}
}
