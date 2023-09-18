package Conditional_Statement;

public class Switch_Case_EG {
	public static void main(String[] args) {
		char ch = 'b';
		//check vowel or not
		switch(ch) {
		case 'a': 
		case 'e':
		case 'i':
		case 'o':
		case 'u': System.out.println("Vowel"); break;
		default: System.out.println("Consonant"); 
		}
	}
}
