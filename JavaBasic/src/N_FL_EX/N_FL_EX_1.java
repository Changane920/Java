package N_FL_EX;

public class N_FL_EX_1 {
	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j<= 5; j++) {
				if(i == 1 || i == 5) {
					System.out.print(" - ");
				} 
				else if(j%2 != 0) {
					System.out.print(" - ");
				}else {
					System.out.print(" + ");
				}
			}
			System.out.println();
		}
	}
}
