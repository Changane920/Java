package N_FL_EX;

public class N_FL_EX_17 {
	public static void main(String[] args) {
		int count = 1;
		for(int row = 1; row <= 5; row++) {
			if(count%2 != 0) {
				for(int space = 4; space >= row; space--) {
					System.out.print(" ");
				}
				for(int star = 1; star <= count; star++) {
					System.out.print("* ");
				}
				System.out.println();
			}
			count+=2;
		}
	}
}
