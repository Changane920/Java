package string_eg;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Check_Password {
	public static void main(String[] args) {
		boolean flag = true;
		while(flag) {
			Scanner input = new Scanner(System.in);
			System.out.println("Enter a password: ");
			String password = input.next();
			
			String regex = "^[a-zA-Z0-9]{8}+$";
			Pattern p = Pattern.compile(regex);
			Matcher m = p.matcher(password);
			
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
