package Method_EX;

import java.util.Scanner;

public class M_EX_1 {
	public static void main(String[] args) {
		input();
	}
	
	static void input() {
		System.out.println("Enter a text!");
		
		try (Scanner input = new Scanner(System.in)) {
			String txt = input.next();
			System.out.println("Output is " + txt);
		}
	}
}
