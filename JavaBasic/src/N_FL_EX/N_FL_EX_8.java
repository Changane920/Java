package N_FL_EX;

public class N_FL_EX_8 {
	public static void main(String[] args) {
		for(int row = 5; row >= 1; row--) {	
			if(row == 5) {
				for(int digit = 1; digit <= row; digit++) {
					System.out.print(digit);
				}
			} else {
				for(int space = 4; space >= row; space--) {
					System.out.print(" ");
				}
				for(int digit = 1; digit <= row; digit++) {
					System.out.print(digit);
				}
			}
			
			System.out.println();
		}
	}
}
