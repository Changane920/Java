package Interface_EX;

public class Ex1_CS implements CharSequence{
	String s = "Hello World";
	
	@Override
	public int length() {
		// TODO Auto-generated method stub
		return s.length();
	}

	@Override
	public char charAt(int index) {
		if((index < 0) || (index > s.length())) {
			throw new StringIndexOutOfBoundsException(index);
		}
		return s.charAt(fromEnd(index));
	}

	@Override
	public CharSequence subSequence(int start, int end) {
		if(start < 0 ) {
			throw new StringIndexOutOfBoundsException(start);
		}
		else if(end > s.length()) {
			throw new StringIndexOutOfBoundsException(end);
		}
		else if(start > end) {
			throw new StringIndexOutOfBoundsException(start - end);
		}

		StringBuilder sb = new StringBuilder(s.subSequence(fromEnd(end), fromEnd(start)));
		return sb.reverse().toString();
	}
	
	public int fromEnd(int end) {
		return s.length() - 1 - end;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(this.s);
		return sb.reverse().toString();
	}
	
	public static void main(String[] args) {
		
	}
}
