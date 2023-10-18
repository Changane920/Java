package Polymorphism;

public class Animal {
	public void Talk() {
		System.out.println("The aniaml talk: ");
	}
	public static void main(String[] args) {
		Dog d = new Dog();
		d.Talk();
		Cat c = new Cat();
		c.Talk();
		Bird b = new Bird();
		b.Talk();
	}
}

