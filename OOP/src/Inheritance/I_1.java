package Inheritance;

public class I_1 extends Vehicle {
	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		v.honk();
		System.out.println(v.b.honk);
	}
}
class Vehicle {
	Bicycle b = new Bicycle();
	
	String model = "BMW";
	void honk() {
		System.out.println("Pi Pi Paw Paw " + model + " " + b.honk);
	}
}
class Bicycle {
	String honk = "wee wee";
}