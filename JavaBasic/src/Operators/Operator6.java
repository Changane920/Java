package Operators;

class Operator6 {
	//reverse number
	public static void main(String[] args) {
		int num = 123;
		int num1,num2,num3;
		
		num1 = (num % 10) * 100;
		num /= 10;
		
		num2 = (num % 10) * 10;
		num /= 10;
		
		num3 = num;
		
		System.out.println("Reverse number is " + (num1 + num2 + num3));
	}
}