package LinkedList;

import java.util.LinkedList;

public class ll_1 {
	public static void main(String[] args) {
		LinkedList<String> car = new LinkedList<String>();
		car.addFirst("Mezada");
		car.addLast("BMW");
		car.addFirst("Hello");
		
		System.out.println(car.getFirst());
		
		System.out.println(car);
		
		car.remove();
		System.out.println(car);
	}
}
