package N_FL_EX;

public class N_FL_EX_20 {
	public static void main(String[] args) {
		char alpha = 'A';
		int num = 69;
		int num2 = 65;
		for(int row = 1; row <= 5; row++) {
				for(char word = alpha; word <= num; word++) {
					System.out.print(word + " ");
				}
				num--;
			System.out.println();
		}
		for(int row = 1; row <= 5; row++) {
			for(char word = alpha; word <= num2; word++) {
				System.out.print(word + " ");
			}
			num2++;
			System.out.println();
		}
	}
	/* output
	 * A B C D E 
	 * A B C D 
	 * A B C 
	 * A B 
	 * A 
	 * A 
	 * A B 
	 * A B C 
	 * A B C D 
	 * A B C D E
	 */
}
