package Array_EX;

import java.util.Scanner;

public class A_EX_6 {
	public static void main(String[] args) {
		System.out.print("Enter a number for search: ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		searchArray(input);
		sc.close();
	}
	static void searchArray(int num) {
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		boolean flag = false;
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] == num) {
				flag = true;
			}
		}
		
		if(flag) {
			System.out.println(num + " is found in an array.");
		}
		else {
			System.out.println(num + " is not found in an array.");
		}
	}
}
