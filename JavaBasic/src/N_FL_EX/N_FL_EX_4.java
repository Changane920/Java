package N_FL_EX;

public class N_FL_EX_4 {
	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) {
			for(int j = 6 - i; j >= 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
