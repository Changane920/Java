package OperatorExample;

public class ID_Operator {
	public static void main(String[] args) {
		int m = 10;
		int result = 5 * m++;
		System.out.println("Result of Postfix Increment: " + result);
		System.out.println(m);
		
		int n = 10;
		int result2 = 5 * ++n;
		System.out.println("Result of Prefix Increment: " + result2);
		
		m = 10;
		result = 5 * m--;
		System.out.println("Result of Postfix Decrement " + result);
	}
}
