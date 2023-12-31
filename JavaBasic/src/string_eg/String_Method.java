package string_eg;

public class String_Method {
	public static void main(String[] args) {
		String s1 = "Hello World!";
		String s2 = "MaungMaungMaung";
		String s3 = "maung maung";
		String text = s1.concat(s2);
		System.out.println(text);
		
		//check two value match or not
		if(s2.equalsIgnoreCase(s3)) {
			System.out.println("Match");
		}
		else {
			System.out.println("No Match");
		}
		
		//check value contain or not
		if(s1.contains("Wo")) {
			System.out.println("Yes");
		}
		
		//check greater than or not with compare method
		if(s1.compareToIgnoreCase(s2) < 0) {
			System.out.println("s1 is greater than s2.");
		}
		else {
			System.out.println("s1 is less than s2.");
		}
		
		//search and replace
		System.out.println("\nSearch and Replace");
		String txt1 = "hello are we draw we are we";
		System.out.println(txt1.indexOf("we")); // most word
		System.out.println(txt1.lastIndexOf("we")); //same word but least word
		
		String replace = s2.replace('M', 'S');
		System.out.println(replace);
	}
}
