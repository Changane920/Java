package Array_EX;

import java.util.Scanner;

public class A_EX_4 {
	//average of an int array
	static int[] array;
	public static void main(String[] args) {
		//userinput
		userInput();
		System.out.println();
		
		//printArray
		printArray(array);
		System.out.println();
		
		//average array
		double result = averageArray(array);
		System.out.print("Average of array: " + result);
	}
	
	static void userInput() {
		Scanner sc = new Scanner(System.in);
		array = new int[5];
		
		for(int i = 0; i < array.length;i++) {			
			System.out.println("Enter a element for " + i);
			array[i] = sc.nextInt();
		}	
		sc.close();
	}
	
	static double averageArray(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += array[i];
		}
		double result = sum/array.length;
		return result;
	}
	
	static void printArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
