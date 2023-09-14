package ID_Op_Ex;

public class ID_Op_Ex_1 {
	public static void main(String[] args) {
		int length = 5;
		int breadth = 7;
		int area = 1;
		area *= length;
		area *= breadth;
		System.out.println("The area of rectangle is " + area);
		
		int parameter = 0;
		parameter += length;
		parameter += breadth;
		parameter *= 2;
		System.out.println("The parameter of rectangle is " + parameter);
	}
}
