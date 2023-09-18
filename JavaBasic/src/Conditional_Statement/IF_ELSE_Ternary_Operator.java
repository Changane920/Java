package Conditional_Statement;

public class IF_ELSE_Ternary_Operator {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		int sum = num1 + num2;
		int multiply = num1 * num2;
		
		// if num2 is greater than num1, do sum 
		// if num2 is less than num1, do multiply
		
		int result = (num2 > num1) ? sum : multiply;
		System.out.println(result);
	}
}
