package Recursion_EX;

import java.util.Scanner;

public class R_EX_4 {
	static String length;
	static int result = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a binary number");
		int num = sc.nextInt();
		length = String.valueOf(num);
		
		convertDecimal(num, 0);
	}
	static void convertDecimal(int num, int i) {
		int temp = num % 10;
		num /= 10;
		
		if(i <= length.length()) {
			result += temp * (int) Math.pow(2, i);
			convertDecimal(num, ++i);
		}
		else {
			System.out.println(result);
		}
	}
}
