package WL_EX;

public class WL_EX_2 {
	public static void main(String[] args) {
		int num = 12345;
		int result = 0;
		int divide;

		while(num > 0) {
			divide = num % 10;
			num /= 10;
			result = result * 10 + divide;
		}
		System.out.println(result);
	}
}