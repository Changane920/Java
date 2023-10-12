package Encapsulation_EX;

public class E_1 {
	public static void main(String[] args) {
		Circle c = new Circle();
		Circle c1 = new Circle(1.2);
		Circle c2 = new Circle(1.3, "a_o_i");

		System.out.println(c);
		System.out.println(c1);
		System.out.println(c2);
	}
}
class Circle{
	//variable
	private double radius;
	private String color;
	
	//getter setter method
	public double getRadius() {
		return radius;
	}
	public void setRadius(double raidus) {
		this.radius = raidus;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	//constructor
	Circle(){
		this.radius = 1.0;
		this.color = "a_ka_i";
	}
	Circle(double r){
		this.radius = r;
	}
	Circle(double r, String c){
		this.radius = r;
		this.color = c;
	}
	
	//to print
	@Override
	public String toString() {
		return "radius: " + getRadius() + "\tcolor: " + getColor() + "\tArea: " + getArea();
	}
	
	double getArea() {
		return Math.PI * (radius * radius);
	}
}
