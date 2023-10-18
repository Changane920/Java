package Poly_EX_4;

public class SubClass extends SuperClass{
	private int data2;

	public int getData2() {
		return data2;
	}
	public void setData2(int data2) {
		this.data2 = data2;
	}
	
	SubClass(int num1, int num2){
		setData1(num1); 
		data2 = num2;
	}
	
	public boolean checkCondition() {
		if(getData1() == data2) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		SubClass s = new SubClass(5,6);
		System.out.println(s.checkCondition());
	}
}
