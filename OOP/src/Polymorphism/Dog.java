package Polymorphism;

public class Dog extends Animal{
	@Override
	public void Talk() {
		super.Talk();
		System.out.println("Woh Woh");
	}
}

