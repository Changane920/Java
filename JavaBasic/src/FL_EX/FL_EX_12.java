package FL_EX;

public class FL_EX_12 {
	public static void main(String[] args) {
		int num = 5;
		int result = 1;
		for(int i = num; i > 0; i--) {
			result *= i;
			System.out.print(i + " x ");
		}
		System.out.print(" = " + result);
	}
}
