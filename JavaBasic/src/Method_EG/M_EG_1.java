package Method_EG;

import java.util.Scanner;

public class M_EG_1 {
	public static void main(String[] args) {
		/* Scanner input = new Scanner(System.in); */
		System.out.println("How many time?");
		
		print((new Scanner(System.in)).nextInt());
	}

	static void print(int x) {
		System.out.println();
		for(int i = 1; i <= x; i++) {
			System.out.println("Hello World!");			
		}
		
		System.out.println();
		
		int i = 0;
		while(i < x) {
			System.out.println("Hello!");
			i++;
		}
	}
}
