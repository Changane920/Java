package WL_EX;

public class WL_EX_5 {
	public static void main(String[] args) {
		// GCD (Greatest Common Divisor)
		int n1 = 15; int n2 = 15;
		while (n2 != 0) {
			int temp = n2;
			n2 = n1 % n2;
			n1 = temp;
		}
		System.out.println(n1);
	}
}
