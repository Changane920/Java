package N_FL_EX;

public class N_FL_EX_5 {
	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) {
			for(int j = 5; j >= i; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
