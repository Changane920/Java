package Method_EX;

import java.util.Scanner;

public class M_EX_3 {

	public static void main(String[] args) {
		char word = 'y';
		while(word == 'y') {
			System.out.println("Enter a number!");
			Scanner input = new Scanner(System.in);
			int num = input.nextInt();
			checkNumber(num);			
			input.close();
			
			System.out.println("Do you want to try another digit? 'y' or 'n'");
			Scanner input2 = new Scanner(System.in);
			word = input2.next().charAt(0);
			input2.close();
		}
	}
	
	static void checkNumber(int num) {
		if(num > 0) {
			System.out.println(num + " is a positive number.");
		}
		else if(num < 0) {
			System.out.println(num + " is a negative number.");
		}
		else {
			System.out.println(num + " is zero.");
		}
	}
}
