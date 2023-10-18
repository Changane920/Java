package Enum;

public class e1 {
	enum Level{
		Low, 
		Medium,
		High
	}
	public static void main(String[] args) {
		for(Level l : Level.values()) {
			System.out.println(l);
		}
	}
}
