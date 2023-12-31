package Recursive_EG;

import java.util.Scanner;

public class R_EG_1 {
	public static void main(String[] args) {
		System.out.println("Non recursive function");
		NonRecursiveFunction(5);
		System.out.println();
		
		System.out.println("Recursive function");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		System.out.println(num * RecursiveFactorial(num - 1));
		sc.close();
	}

	private static void NonRecursiveFunction(int num) {
		// TODO Auto-generated method stub
		int result = 1;
		if(num == 0 || num == 1) {
			System.out.println(1);
		}
		else {
			for(int i = num; i >= 1; i--) {
				result *= i;
			}
			System.out.println(result);
		}
	}
	
	private static double RecursiveFactorial(double num) {
		int result = 1;
		if(num == 0 || num == 1) {
			System.out.println(1);
		}
		else {
			for(double i = num; i > 1; i--) {
				result *= i;
			}
		}
		return result;
	}
}
