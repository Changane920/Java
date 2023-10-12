package Encapsulation_EX;

public class E_2 {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		System.out.println(r);
		
		Rectangle r2 = new Rectangle(2,2);
		System.out.println(r2);
	}

}
class Rectangle{
	private float length;
	private float width;
	
	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		this.length = length;
	}
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		this.width = width;
	}
	
	Rectangle(){
		this.length = 1.0f;
		this.width = 1.0f;
	}
	Rectangle(float l, float w){
		this.length = l;
		this.width = w;
	}
	
	@Override
	public String toString() {
		return "length: " + getLength() + "\twidth: " + getWidth() + "\tArea: " + getArea() + "\tParameter: " + getParameter();
	}
	
	double getArea() {
		return getLength() * getWidth();
	}
	
	double getParameter() {
		return 2 * (getLength() + getWidth());
	}
}
