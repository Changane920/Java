package Encapsulation_EX;

public class ComplexDemo3 {
	public static void main(String[] args) {
		Complex3 c1 = new Complex3();
		Complex3 c2 = new Complex3(5,5);
		Complex3 c3 = new Complex3(2,2);
		Complex3 c4 = new Complex3(3,3);									
		Complex3 c5 = new Complex3(9,9);

		System.out.println("\nSum\n");
		c1.setRealPart(3);
		System.out.println("c1's before sum: " + c1.toString());			//3.0,0.0
		c1.add(c2);
		System.out.println("c2's string: " + c2.toString());				//5.0,5.0
		System.out.println("c1's after sum: " + c1.toString());				//8.0,5.0
		
		System.out.println("\nSubtract\n");
		System.out.println("c3's before sub: " + c3.toString());			//2.0,2.0
		c3.subtract(c1);
		System.out.println("c1's string: " + c1.toString());				//8.0,5.0
		System.out.println("c3's after sub c3 - c1: " + c3.toString());		//-6.0,-3.0
		
		System.out.println("\nMultiply\n");
		System.out.println("c4's before multi: " + c4.toString());			//3.0,3.0
		c4.multiply(c3);
		System.out.println("c3's string: " + c3.toString());				//-6.0,-3.0
		System.out.println("c4's after multi: " + c4.toString());			//-18.0,-9.0
		
		System.out.println("\nDivide\n");
		System.out.println("c4's before divide: " + c4.toString());			//-18.0,-9.0			
		c4.divide(c5);
		System.out.println("c5's string: " + c5.toString());				//9.0,9.0
		System.out.println("c4's after divide: " + c4.toString());			//-2.0,-1.0
	}
}
