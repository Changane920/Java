package FL_EX;

public class Continue_EX {
	public static void main(String[] args) {
		for(int i = 10; i <= 20; i+=2) {
			if(i == 16) {
				continue;
			}
			else {
				System.out.println(i);
			}
		}
	}
}
