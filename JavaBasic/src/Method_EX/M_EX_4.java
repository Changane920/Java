package Method_EX;

import java.util.Scanner;

public class M_EX_4 {
	public static void main(String[] args) {
		System.out.print("Enter first number: ");
		Scanner input1 = new Scanner(System.in);
		int num1 = input1.nextInt();
		
		System.out.println();
		
		System.out.print("Enter second number: ");
		Scanner input2 = new Scanner(System.in);
		int num2 = input2.nextInt();
		
		System.out.println();
		
		System.out.print("Etner third number: ");
		Scanner input3 = new Scanner(System.in);
		int num3 = input3.nextInt();
		
		int num = checkNumber(num1,num2,num3);
		System.out.println();
		System.out.println(num + " is a largest number.");
		
		input1.close();
		input2.close();
		input3.close();
	}
	
	static int checkNumber(int n1, int n2, int n3) {
		//check with ternary
		int num = n1 > n2 ? (n1 > n3 ? n1 : n3) : (n2 > n3 ?n2 : n3);
		
		//check with nested if
		/*
		if(n1 > n2) {
			if(n1 > n3) {
				num = n1;
			}
			else {
				num = n3;
			}
		}
		else if(n2 > n1) {
			if(n2 > n3) {
				num = n2;
			}
			else {
				num = n3;
			}
		}
		else {
			num = n3;
		}
		*/
		
		return num;
	}
}
