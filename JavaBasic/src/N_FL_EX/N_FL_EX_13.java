package N_FL_EX;

public class N_FL_EX_13 {
	public static void main(String[] args) {
		for(int row = 1; row <= 5; row++) {
			for(int space = 5 - row; space >= 1; space--) {
				System.out.print(" ");
			}
			for(int num = 1; num <= row; num++) {
				System.out.print(row + " ");
			}
			System.out.println();
		}
	}
}
