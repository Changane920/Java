package Encapsulation_EX;

public class Complex3 {
	private double realPart, imaginaryPart;
	
	//constructor
	public Complex3() {
		realPart = 0;
		imaginaryPart = 0;
	}
	public Complex3(double r, double i) {
		realPart = r;
		imaginaryPart = i;
	}
	
	//getter setter
	public double getRealPart() {
		return realPart;
	}
	public void setRealPart(double r) {
		this.realPart = r;
	}
	public double getImaginaryPart() {
		return imaginaryPart;
	}
	public void setImaginaryPart(double i) {
		this.imaginaryPart = i;
	}
	
	public Complex3 add(Complex3 c) {
		this.realPart += c.realPart;
		this.imaginaryPart += c.imaginaryPart;
		return this;
	}
	public Complex3 subtract(Complex3 c) {
		this.realPart -= c.realPart;
		this.imaginaryPart -= c.imaginaryPart;
		return this;
	}
	public Complex3 multiply(Complex3 c) {
		this.realPart *= c.realPart;
		this.imaginaryPart *= c.imaginaryPart;
		return this;
	}
	public Complex3 divide(Complex3 c) {
		this.realPart /= c.realPart;
		this.imaginaryPart /= c.imaginaryPart;
		return this;
	}
	
	@Override
	public String toString() {
		return "realPart: " + realPart + " imaginaryPart: " + imaginaryPart;
	}
}
