package N_FL_EX;

public class N_FL_EX_9 {
	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) {
			for(int space = 5 - i; space >= 1; space--) {
				System.out.print(" ");
			}
			for(int first = 1; first <= i-1; first++) {
				System.out.print(first);
			}

			System.out.print(i);

			for(int third = i - 1; third >= 1; third--) {
				System.out.print(third);
			}
			System.out.println();
		}
	}
}
