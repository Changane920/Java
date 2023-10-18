package Shape_Polymorphism;

public class Shape {
	private double width,length;
	
	public double getWidth() {
		return this.width;
	}
	public void setWidth(double w) {
		this.width = w;
	}
	public double getLength() {
		return this.length;
	}
	public void setLength(double l) {
		this.length = l;
	}
	
	public void area() {
		System.out.println("The area of" + getClass() +" is");
	}
	
	public void para() {
		System.out.println("The parameter of " + getClass() + " is");
	}
}
