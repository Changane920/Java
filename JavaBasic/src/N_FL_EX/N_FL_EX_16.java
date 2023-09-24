package N_FL_EX;

public class N_FL_EX_16 {
	public static void main(String[] args) {
		for(int row = 1; row <= 3; row++) {
			for(int space = 2; space >= row; space--) {
				System.out.print(" ");
			}
			for(int star = 1; star <= row; star++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int row = 1; row <= 2; row ++) {
			for(int space = 1; space <= row; space++) {
				System.out.print(" ");
			}
			for(int star = 2; star >= row; star--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
