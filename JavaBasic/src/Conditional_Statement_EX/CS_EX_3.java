package Conditional_Statement_EX;

public class CS_EX_3 {
	public static void main(String[] args) {
		int num = 0;
	
		// check positive, zero, negative
		
		if(num > 0) {
			System.out.println(num + " is a positive number.");
		}
		else if(num == 0) {
			System.out.println(num + " is zero.");
		}
		else if(num < 0) {
			System.out.println(num + " is negative number.");
		}
	}
}
