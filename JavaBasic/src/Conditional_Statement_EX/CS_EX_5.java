package Conditional_Statement_EX;

public class CS_EX_5 {
	public static void main(String[] args) {
		int num = 1900;
		
		// check leap year or not
		
		if(num % 4 == 0) {
			if(num % 100 != 0) {
				System.out.println(num + " is a leap year.");
			}
			else if(num % 400 == 0) {
				System.out.println(num + " is a leap year.");
			} 
			else {
				System.out.println(num + " is not a leap year.");
			}
		}
		else {
			System.out.println(num + "is not a leap year.");
		}
	}
}
