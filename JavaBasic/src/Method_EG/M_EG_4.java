package Method_EG;

import java.util.Scanner;

public class M_EG_4 {
	public static void main(String[] args) {
		char txt = 'y';
		
		while(txt == 'y') {
			System.out.println("First number");
			Scanner input1 = new Scanner(System.in);
			int num1 = input1.nextInt();
			
			Scanner input2 = new Scanner(System.in);
			System.out.println("Second number");
			int num2 = input2.nextInt();
			
			Scanner input3 = new Scanner(System.in);
			System.out.println("Arithmtic Expression");
			char operator = input3.next().charAt(0);
			
			//check number 
			if(num1 < num2) {
				int temp = num1;
				num1 = num2;
				num2 = temp;
			}
			
			switch (operator) {
			case '+': 
				System.out.println("\nAnswer is " + sum(num1,num2));
				break;
			case '-':
				System.out.println("\nAnswer is " + minus(num1,num2));
				break;
			case '*':
				System.out.println("\nAnswer is " + multiply(num1,num2));
				break;
			case '/':
				System.out.println("\nAnswer is " + divide(num1,num2));
				break;
			}
			
			System.out.println("Do you want to make another calculation? 'y' or 'n'");
			Scanner input4 = new Scanner(System.in);
			txt = input4.next().charAt(0);
		}			
	}
	//sum function	
	static int sum(int x, int y) {
		return x + y;
	}
	//minus function
	static int minus(int x, int y) {
		return x - y;
	}
	//multiply function
	static int multiply(int x, int y) {
		return x * y;
	}
	//divide function
	static int divide(int x, int y) {
		return x / y;
	}
}
