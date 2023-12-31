package Method_EX;

import java.util.Scanner;

public class M_EX_5 {
	public static void main(String[] args) {
		// Fahrenheit <--> Celcius
		System.out.println("f or c");
		Scanner input = new Scanner(System.in);
		char txt = input.next().charAt(0);

		if (txt == 'f') {
			System.out.print("Enter a Fahrenheit number: ");
			float num = input.nextFloat();
			
			float result = Fah_Cel(num);
			System.out.println("Fahrenheit: " + result);
		} 
		else {
			System.out.print("Enter a Celsius number: ");
			float num = input.nextFloat();
			
			float result = Cel_Fah(num);
			System.out.println("Celsius: " + result);
		}
		input.close();
	}

	static float Fah_Cel(float num) {
		float result = (num - 32)*5/9;
		return result;
	}

	static float Cel_Fah(float num) {
		float result = num * 9/5 + 32;
		return result;
	}	
}
