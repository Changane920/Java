package N_FL_EX;

public class N_FL_EX_25 {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 1;
		int num3 = 1;
		
		for(int row = 1; row <= 5; row++) {
			for(int col = 1; col <= row; col++) {
				System.out.print(num3 + " ");
				int sum = num1 + num2;
				num1 = num2;
				num2 = sum;
				num3 = sum;
			}
			System.out.println();
		}
	}
}
