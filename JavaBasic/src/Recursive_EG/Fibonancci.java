package Recursive_EG;

public class Fibonancci {
	public static void main(String[] args) {
		N_Recursive_Fibo(4);
		
		//recursive fibonancci
		int fibo = Recur_Fibo(5);
		System.out.println(fibo);
	}
	
	static void N_Recursive_Fibo(int num) {
		int first = 1;
		int second = 1;
		int third = 0;
		
		while(num > 0) {
			third = first + second;
			first = second;
			second = third;			
			num--;
		}
		System.out.println(third);
	}
	
	static int Recur_Fibo(int num) {
		int result = 0;
		if(num <= 1) {
			return num;
		}
		else {
			result = Recur_Fibo(num - 1) + Recur_Fibo(num - 2);
			return result;
		}
	}
}
