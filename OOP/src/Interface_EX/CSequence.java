package Interface_EX;

public class CSequence implements CharSequence{
	@Override
	public int length() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public char charAt(int index) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public CharSequence subSequence(int start, int end) {
		return null;
	}
	
	public static void main(String[] args) {
		String str = "Hello World!";
		int length = str.length();
		System.out.println("Length: " + length);
		
		char fChar = str.charAt(0);
		char sChar = str.charAt(length - 1);
		System.out.println("FirstChar: " + fChar + " SecondChar: " + sChar); 
		
		CharSequence cs = str.subSequence(0, 5);
		System.out.println("Subsequence: " + cs);
		
		char[] array = new char[str.length()];
		array = str.toCharArray();
		
		System.out.print("Reverse: ");
		for(int i = str.length()-1; i >= 0; i--) {
			System.out.print(array[i]);
		}
	}
}
