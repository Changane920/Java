package FL_EX;

public class FL_EX_15 {
	public static void main(String[] args) {
		//check prime number
		int num = 101;
		boolean flag = false;
		
		if(num == 1) {
			System.out.println(num + " is not a prime number.");
		}
		else {
			for(int i = 2; i <= num/2; i++) {
				if(num % i == 0) {
					flag = true;
					break;
				}
			}		
			if(!flag) {
				System.out.println(num + " is a prime number.\n");
			} 
			else {
				System.out.println(num + " is not a prime number.\n");
			}
		}
	}
}
