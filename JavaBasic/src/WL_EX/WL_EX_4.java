package WL_EX;

public class WL_EX_4 {
	public static void main(String[] args) {
		int num = 371;
		int temp = num;
		int result = 0;
		
		while (num > 0) {
			int digit = num % 10;
			result += digit * digit * digit;
			num /= 10;
		}
		if(result == temp)
		System.out.println(temp + " is a armstrong number.");
		else 
		System.out.println(temp + " is not armstrong number.");
	}
}
