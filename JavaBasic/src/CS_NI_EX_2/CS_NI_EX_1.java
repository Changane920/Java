package CS_NI_EX_2;

public class CS_NI_EX_1 {
	public static void main(String[] args) {
		// check maximum number
		
		int num1 = 70; int num2 = 50; int num3 = 80; int num4 = 40;
		
		if(num1 > num2) {
			if(num1 > num3) {
				if(num1 > num4)
					System.out.println(num1 + " is a largest number.");
				else 
					System.out.println(num4 + " is a largest number.");
			}
			else {
				System.out.println(num3 + " is a largest number.");
			}
		}
		else if(num2 > num3) {
			if(num2 > num4)
				System.out.println(num2 + " is a largest number.");
			else 
				System.out.println(num4 + " is a largest number.");
		}
		else if(num3 > num4){
			System.out.println(num3 + " is a largest number.");
		}
		else 
			System.out.println(num4 + " is a largest number.");
		//-------------------------------------------------------------------//
		System.out.println("Ternary Operator");
		int result = (num1 > num2) ?(num1 > num3 ?num1 :num3) :(num2 > num3) ?num1 :num2;
		System.out.println(result);
	}
}
