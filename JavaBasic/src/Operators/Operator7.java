package Operators;

class Operator7 {
	public static void main(String[] args) {
		ReverseMethod();
	}
	public static void ReverseMethod() {
		int num = 12345;		
		int[] array = new int[5];

		for(int i = 4; i >= 0; i--) {
			array[i] = num%10;
			num = num / 10;
		}
		
		int result = array[0] + array[3];
	
		System.out.println("Result: " + result);
	}
}