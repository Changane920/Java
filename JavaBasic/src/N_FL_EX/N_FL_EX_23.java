package N_FL_EX;

public class N_FL_EX_23 {
	public static void main(String[] args) {
		int count = 0;
		int num = 5;
		for(int row = 1; row <= num; row++) {
			for(int column = 1; column <= num - 1; column++) {
				if(count <= 8) {
					System.out.print(++count);					
				}
				else {
					count = 0;
					System.out.print(count);
				}
			}
			System.out.println();
		}
	}
}
