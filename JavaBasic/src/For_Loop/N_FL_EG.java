package For_Loop;

public class N_FL_EG {
	public static void main(String[] args) {
		System.out.println(" " + "\tn" + "\tn^2" + "\tn^3" + "\tn^4");
		int num = 0;
		
		for (int i = 1; i <= 5; i++) {
			num = i;
			switch(num) {
			case (1):
			case (2):
			case (3):
			case (4):
			case (5):
				System.out.print(num);
				for(int j = 1; j <= 4; j++) {
					System.out.print("\t" + (int) Math.pow(num, j));
				}
				System.out.println();
				break;			
			}
		}
	}
}
