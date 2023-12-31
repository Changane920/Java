package string_eg;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Check_Email {
	public static void main(String[] args) {
		boolean flag = true;
		Matcher m = null;
		
		while(flag == true) {
			Scanner input = new Scanner(System.in);
			System.out.println("Enter your email!");
			String email = input.next();
			
			String regex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
			Pattern p = Pattern.compile(regex);
			m = p.matcher(email);
			
			if(m.matches()) {
				System.out.println("Valid!");
				flag = false;
			}
			else {
				System.out.println("Unvalid!");
			}			
		}
		
	}
}
