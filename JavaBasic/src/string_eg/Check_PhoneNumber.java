package string_eg;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Check_PhoneNumber {
	public static void main(String[] args) {
		Matcher m = null;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Your Phone Number!");
		String phone = input.next();
		
		
		String regex = "^\\d{11}+$";
		Pattern p = Pattern.compile(regex);
		m = p.matcher(phone);			
	
		if(m.matches()) {
			System.out.println("Valid!");
		}
		else {
			System.out.println("Unvalid!");
		}			
	}
}
