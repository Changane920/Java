package Poly_EX_5;

public class MyMath {
	public int add(int num1, int num2) {
		return num1 + num2;
	}
	public int add(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
	public int add(int num1, int num2, int num3, int num4) {
		return num1 + num2 + num3 + num4;
	}
	public static void main(String[] args) {
		MyMath m = new MyMath();
		System.out.println(m.add(5, 5));
		System.out.println(m.add(5, 5, 5));
		System.out.println(m.add(5, 5, 5, 5));
	}
}
