package Method_EX;

import java.util.Scanner;

public class M_EX_6 {
	int num1, num2, num3;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a first number: ");
		int num1 = input.nextInt();
		
		System.out.print("Enter a second number: ");
		int num2 = input.nextInt();
		
		System.out.print("Enter a third number: ");
		int num3 = input.nextInt();
		
		System.out.println("Average number of " + num1 + " " + num2 + " " + num3 + " is " + calculateNum(num1,num2,num3));
		input.close();
	}
	
	static double calculateNum(int num1, double num2, double num3) {
		double result = (num1 + num2 + num3) / 3;
		return result;
	}
}
