package WL_EX;

public class WL_EX_3 {
	public static void main(String[] args) {
		int num = 54345;
		int temp = num;
		int result = 0, divide = 0;
		
		while( num > 0 ) {
			divide = num % 10;
			num /= 10;
			result = result * 10 + divide;	
		}
		if(result == temp) {
			System.out.println(true);
		} 
		else {
			System.out.println(false);
		}
	}
}
