package N_FL_EX;

public class N_FL_EX_19 {
	public static void main(String[] args) {
		char alpha = 'A';

		for(int row = 1; row <= 8; row++) {
			for(char word = 1; word <= row; word++) {
				System.out.print(alpha + " ");

				if(alpha >= 65 && alpha <= 89) {
					alpha++;						
				}else {
					alpha = 64;
					alpha++;
				}
			}
			System.out.println();			
		}
	}
}
