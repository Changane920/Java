package Recursion_EX;

import java.util.Arrays;

public class R_EX_8 {
	public static void main(String[] args) {
		String str = "Hellox Worldx Nicex Tox Meetx Youx";
		int end = str.length();

		System.out.println(countx(str,str.length()));
	}
	static int countx(String str, int end) {
		if(end == 0) {
			return 0;
		}
		else if(str.charAt(end - 1) == 'x'){
			return 1 + countx(str,end-1);
		}
		return countx(str,end-1);
	}
}
