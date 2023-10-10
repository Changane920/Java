package Recursion_EX;

public class R_EX_7 {
	static int result = 0;
	
	public static void main(String[] args) {
		System.out.println(sum(125));
	}
	static int sum(int num) {
		if(num > 0) {
			int temp = num % 10;
			num /= 10;
			result += temp;
			sum(num);
		}
		return result;
	}
}
