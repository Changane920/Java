package Recursion_EX;

public class R_EX_1 {
	static int result = 0;
	public static void main(String[] args) {
		System.out.println(reverse(375));
	}
	static int reverse(int num) {
		int num1 = num % 10;
		num = num/2;
		result = (result * 10) + num1;
		reverse(num);
		return result;
	}
}
