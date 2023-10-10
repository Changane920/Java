package Recursion_EX;

public class R_EX_3 {
	public static void main(String[] args) {
		boolean flag = checkPrime(55,2);
		
		if(flag) {
			System.out.println("Prime number.");
		}
		else {
			System.out.println("not prime number.");
		}
	}
	static boolean checkPrime(int num, int i) {
		if(i <= num) {
			if(num % i != 0) {
				checkPrime(num,++i);				
			}
			return true;
		}
		return false;
		
	}
}
