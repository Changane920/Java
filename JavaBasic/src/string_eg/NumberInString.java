package string_eg;

import java.text.NumberFormat;

public class NumberInString {
	public static void main(String[] args) {
		double d = 1.23153;
		NumberFormat nf = NumberFormat.getNumberInstance();
		nf.setMaximumIntegerDigits(3);
		String s = nf.format(d);
		System.out.println(s);
	}
}
