package WL_EX;

public class WL_EX_1 {
	public static void main(String[] args) {
		int num = 9;
		int counter = 0;
		while(num != 0) {
			num /= 2;
			counter++;
		}
		System.out.println(counter);
	}
}
