package WL_EG;

public class WL_EG_2 {
	public static void main(String[] args) {
		int num = -10;
		while (num != 0) {
			if(num > 0) {
				System.out.println(num);
				num--;
			}
			else if(num < 0) {
				System.out.println(num);
				num++;
			}
		}
	}
}
