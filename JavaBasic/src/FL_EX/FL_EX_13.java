package FL_EX;

public class FL_EX_13 {
	public static void main(String[] args) {
		int base = 2; 
		int power = 10;
		int result = 1;
		
		for(int i = 1; i <= power; i++ ) {
			result *= base;
		}
		System.out.println(base + " powwer of " + power + " is " + result);
	}
}
