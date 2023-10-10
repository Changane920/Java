package Recursion_EX;

public class R_Ex_6 {
	public static void main(String[] args) {
		System.out.println(countEight(8080808));		
	}
	static int countEight(int num) {
		if(num == 0) {
			return 0;
		}
		else if(num % 10 == 8) {
			if((num/10)%10 == 8) {
				return 2 + countEight(num/10);
			}
			return 1 + countEight(num/10);
		}
		return countEight(num/10);
	}
}
