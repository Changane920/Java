package Array_EX;

public class A_EX_11 {
	public static void main(String[] args) {
		String str = "This is an owls.";
		String str2 = "This is a word.";
		
		char[] c_array = str.replaceAll(" ", "").toCharArray();
		char[] c_array2 = str2.replaceAll(" ", "").toCharArray();
		
		if(c_array.length == c_array2.length) {
			for(int i = 0; i < c_array.length; i++) {
				if(c_array[i] == c_array2[i]) {
					System.out.println("same.");
					break;
				}
			}
		}
		else {
			System.out.println("not same.");
		}
	}
}
