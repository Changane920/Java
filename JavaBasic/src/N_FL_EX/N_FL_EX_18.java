package N_FL_EX;

public class N_FL_EX_18 {
	public static void main(String[] args) {
		for(int row = 1; row <= 5; row++) {
			for(int space = 1; space <= row - 1; space++) {
				System.out.print(" ");
			}
			for(int star = 5; star >= row; star--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int row = 2; row <= 5; row++) {
			for(int space = 4; space >= row; space--) {
				System.out.print(" ");
			}
			for(int star = 1; star <= row; star++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
