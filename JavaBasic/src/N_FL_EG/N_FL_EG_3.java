package N_FL_EG;

public class N_FL_EG_3 {
	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) {
			if(i == 1 || i == 5) {
				for(int j = 1; j <= 5; j++) {
					System.out.print(1 + " ");
				}
				System.out.println();
			}
			else if(i == 2 || i == 3 || i == 4) {
				System.out.print(1 + " ");
				for(int l = 1; l <= 3; l++) {
					System.out.print(0 + " ");
				}
				System.out.println(1);
			}
		}
	}
}
