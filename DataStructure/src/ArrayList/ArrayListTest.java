package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<String> car = new ArrayList<String>();
		car.add("BMW");
		car.add("Volvo");
		car.add("Mazada");
		car.add("Toyota");
		
		System.out.println("Normal Print");
		System.out.print(car);
		
		System.out.println("\nForeach");
		for(String i : car) {
			System.out.print(i + " ");
		}
		
		System.out.println("\nFor");
		for(int i = 0; i < car.size(); i++) {
			System.out.print(car.get(i) + " ");
		}
		
		car.set(2, "Honda");
		System.out.println("\nAfter set");
		System.out.print(car);
		
		car.remove(3);
		System.out.println("\nAfter remove one index");
		System.out.print(car);
		
		Collections.sort(car);
		System.out.println("\nAfter sort");
		System.out.print(car);
		
		car.clear();
		System.out.println("\nAfter clear");
		System.out.println(car);
	}
}
