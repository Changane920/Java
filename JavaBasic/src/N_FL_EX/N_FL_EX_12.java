package N_FL_EX;

public class N_FL_EX_12 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			int count = i;

            for (int j = 5 - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(count);
                count++;
            }
            count--;
            for(int p = 1; p <= i - 1; p++) {
            	System.out.print(--count);
            }
            System.out.println();
        }
	}
}
