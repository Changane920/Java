package N_FL_EX;

public class N_FL_EX_21 {
	public static void main(String[] args) {
		char alpha = 'A';
		char temp = alpha;
		int num = 65;
		int num2 = 65;
		
		for(int i = 1; i <= 5; i++) {
			for(int space = 5 - i; space >= 1; space--) {
				System.out.print(" ");
			}
			for(char j = alpha; j <= num - 1; j++) {
				System.out.print(j);
				}
			num++;
			for(char k = temp; k >= num2; k--) {
				System.out.print(k);
			}
			temp++;
			System.out.println();
		}
	}
	/*output
	 *     A 
	 *    ABA 
	 *   ABCBA 
	 *  ABCDCBA 
	 * ABCDEDCBA
	 */

}