package For_Loop;

public class FL_EX_1 {
	public static void main(String[] args) {
		//check even number
		int count = 0;
		for(int i = 2; i <= 100; i++) {
			if(i%2 == 0) {
				System.out.print(i + ",");
				count++;
			}
			if(count == 10) {
				System.out.println();
				count = 0;
			}
		}
	}
}
