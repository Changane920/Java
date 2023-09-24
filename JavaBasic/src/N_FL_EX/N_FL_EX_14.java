package N_FL_EX;

public class N_FL_EX_14 {
	public static void main(String[] args) {
		for(int row = 1; row <= 5; row++) {
			for(int star = 1; star <= row; star++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int row = 1; row <= 5; row++) {
			for(int star = 5; star >= row; star--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
