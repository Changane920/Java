package Conditional_Statement_EX;

public class CS_EX_2 {
	public static void main(String[] args) {
		int num1 = 50;
		int num2 = 50;
		int num3 = 60;
		
		//find the maximum number
		
		if(num1 > num2 && num1 > num3) {
			System.out.println("num1 is the maximum number.");
		}
		else if(num2 > num1 && num2 > num3) {
			System.out.println("num2 is the maximum number.");
		}
		else if(num3 > num1 && num3 > num2){
			System.out.println("num3 is the maximum number.");
		}
		// when the number is match
		else if(num1 == num2) {
			System.out.println("The maximum number is num1 and num2.");
		}
		else if(num1 == num3) {
			System.out.println("The maximum number is num1 and num3.");
		}
		else if(num2 == num3) {
			System.out.println("The maximum number is num2 and num3.");
		}
	}
}
