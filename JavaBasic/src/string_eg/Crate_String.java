package string_eg;

public class Crate_String {
	public static void main(String[] args) {
		String s1 = "Hello from Java!"; // declare with primitive data type
		System.out.println(s1);
	
		String s2;
		s2 = "Hello from java2!"; 
		System.out.println(s2);
		
		String s3 = new String(); // declare with class
		s3 = "Hello from java3!";
		System.out.println(s3);
		
		char ch[] = {'H', 'i', ' ', 't', 'h', 'e', 'r', 'e'};
		String s4 = new String(ch);
		System.out.println(s4); // declare with array
		
		String s5 = new String(ch,0,2); // (ch, inclusive, exclusive)
		System.out.println(s5);
		
		String s6 = String.valueOf(ch);
		System.out.println(s6);
	}
}
