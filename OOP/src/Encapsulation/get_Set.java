package Encapsulation;

public class get_Set {
	private String name = "blur";
	
	String getName() {
		return name;
	}
	void setName(String str) {
		name = str;
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		get_Set myObj = new get_Set();
		System.out.println(myObj.getName());
		myObj.setName("Hello World");
	}
}
