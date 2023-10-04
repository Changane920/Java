package For_Loop;

public class FL_Break_EG {
	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			if(i == 3) {
				break;
			}
			else
				System.out.println(i + 1);
		}
	}
}
