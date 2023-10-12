package Constructor_Exercise;

public class C_1 {
	public static void main(String[] args) {
		Car c = new Car();
		System.out.println(c.brand);
		
		System.out.println(c.getBrand("Mitsubishi"));
	}
}
class Car {
	String brand;
	Car() {
		brand = "Ford";
	}
	String getBrand(String str) {
		brand = str;
		return brand;
	}
}