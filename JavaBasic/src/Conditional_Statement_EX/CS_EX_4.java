package Conditional_Statement_EX;

public class CS_EX_4 {
	public static void main(String[] args) {
		int num = 66;
		
		// check num can divide by 5 and 11 or not
		
		if(num%5 == 0) {
			System.out.println(num + " can divisible by 5.");
		} 
		else if(num % 11 == 0) {
			System.out.println(num + " can divisible by 11");
		} 
		else {
			System.out.println(num + " cannot divisible by 5 and 11.");
		}
	}
}
