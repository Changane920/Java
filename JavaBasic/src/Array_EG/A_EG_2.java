package Array_EG;

import java.util.Scanner;

public class A_EG_2 {
	public static void main(String[] args) {
		int[] array = new int[5];
		
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i < array.length; i++) {
			System.out.print("Enter a number for " + i + ":");
			array[i] = input.nextInt();
		}
		
		System.out.println("\nNumber in Array");
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		input.close();;
	}
}
