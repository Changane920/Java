package N_FL_EX;

public class N_FL_EX_11 {
	public static void main(String[] args) {
		for(int i = 0; i <= 5; i++) {
			for(int space = 5 - i; space >= 1; space--) {
				System.out.print(" ");
			}
			for(int first = 1; first <= i; first++) {
				System.out.print(first);
			}

			System.out.print(0);
			
			for(int second = 1; second <= i; second++) {
				System.out.print(second);
			}
			System.out.println();
		}
	}
}
