package Enum;

public class TrafficLight {
	enum Traffic{
		red,
		yellow,
		green;
		
		public boolean isRed(Traffic e) {
			return e == red;
		}
		public boolean isYellow(Traffic e) {
			return e == yellow;
		}
		public boolean isGreen(Traffic e) {
			return e == green;
		}
	}
	public static void main(String[] args) {
		Traffic t = Traffic.yellow;

		if(t.isRed(t)) {
			System.out.println("Stop!");
		}
		else if(t.isYellow(t)) {
			System.out.println("Slow Down!");
		}
		else if(t.isGreen(t)) {
			System.out.println("Go!");
		}
	}
}
