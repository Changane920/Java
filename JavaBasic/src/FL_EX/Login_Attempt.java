package FL_EX;

import java.util.Scanner;

public class Login_Attempt {
	
	public static void main(String[] args) {
		int count = 0;
		String name = "chan";
		String pass = "chan12";
		String uname, upass;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("Enter a name: ");
			uname = sc.next();
			System.out.print("Enter a password: ");
			upass = sc.next();
			count++;
			
		} while (count < 5 && !(uname.equals(name) && upass.equals(pass)));
	}
}
