package Shape_Polymorphism;

import java.util.Scanner;

public class Traingle extends Shape{
	private int base,length,side;
		
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public double getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getSide() {
		return side;
	}
	public void setSide(int side) {
		this.side = side;
	}
	
	public Traingle() {
		base = 5;
		length = 5;
		side = 5;
	}

	@Override
	public void area() {
		double tside = (base+length+side)/2;
		double height = Math.sqrt(tside * (tside - getBase()) * (tside - getLength()) * (tside - getSide()));
		super.area();
		System.out.println(1/2.0 * (getBase() * height));
	}
	
	@Override
	public void para() {
		// TODO Auto-generated method stub
		super.para();
		System.out.println(getBase() + getLength() + getSide());
	}
	
	//check traingle type
	public void checkTraingle(int b, int l, int s) {
		if(b == l && b == s || l == b && l ==s) {
			System.out.println("This traingle is three same side traingle.");
		}
		else if(b == l && b != s || l != b && l == s || s == b && s != l ) {
			System.out.println("This traingle is two same side traingle.");
		}
		else {
			System.out.println("An equilateral traingle.");
		}
	}
	
	public static void main(String[] args) {
		Traingle t = new Traingle();
		t.area();
		t.para();
		
	}
}
