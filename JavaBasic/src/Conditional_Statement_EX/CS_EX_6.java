package Conditional_Statement_EX;

public class CS_EX_6 {
	public static void main(String[] args) {
		char ch = '1';
	
		//check alphabet or not
		if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
			System.out.println(ch + " is a character.");
		}
		else {
			System.out.println(ch + " is not a character.");
		}
	}
}
