package Object_Class;

class Car{
	String model = "Konichiwa!";
	
	public void Throttle() {
		System.out.println("This car is going as fast as it can.");
	}
	public void Speed(int maxSpeed) {
		System.out.println(maxSpeed);
	}
}

public class Test {
	public static void main(String[] args) {
		Car obj = new Car();
		System.out.println(obj.model);
		obj.Throttle();
		obj.Speed(150);
	}
}
