package Conditional_Statement_EX;

public class CS_EX_1 {
	public static void main(String[] args) {
		int num1 = 15; int num2 = 17;
	
		// if else statement
		if(num1 > num2) {
			System.out.println("num1 is the maximum number.");
		}
		else {
			System.out.println("num2 is the maximum number.");
		}
	
		//ternary operator
		String result = (num1 > num2) ? "num1 is maximum number." : "num2 is maximum number." ;
		System.out.println(result);
	}
}
