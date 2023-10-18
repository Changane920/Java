package Nested_Class;

public class Inner_Outer_class {
	public static void main(String[] args) {
		Outer o = new Outer();
		Outer.Inner i = new Outer.Inner();
		System.out.println(o.num1);
		
		System.out.println(i.num2);
	}
}

class Outer{
	int num1 = 5;
	static class Inner{
		int num2 = 3;
	}
}
