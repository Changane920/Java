package N_FL_EX;

public class N_FL_EX_25 {
	public static void main(String[] args) {
		for(int row = 1; row <= 5; row++) {
			for(int col = 1; col <= row; col++) {
				System.out.print(row - col + 1);
			}
			System.out.println();
		}
	}
}
