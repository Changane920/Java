package Constructor;

public class CircleArea {
	double radius = 1.0;
	String color = "red";
	
	CircleArea(){
		
	}
	CircleArea(double r){
		getRadius(r);
	}
	double getRadius(double r) {
		return this.radius = r;
	}
	double getArea() {
		return Math.PI * (radius * radius);
	}
	
	public static void main(String[] args) {
		CircleArea c = new CircleArea();
		System.out.println("radius: " + c.radius + " CircleArea: " + c.getArea());
		CircleArea c2 = new CircleArea(2);
		System.out.println("radius: " + c2.radius + " CircleArea: " + c2.getArea());
	}
}
