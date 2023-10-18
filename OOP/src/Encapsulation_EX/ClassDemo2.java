package Encapsulation_EX;

public class ClassDemo2 {
	public static void main(String[] args) {
		Clock2 firstClock = new Clock2(5);
		
		for(int i = 0; i < 10; i++) {
			firstClock.tick();
			System.out.println(firstClock.getSeconds());
		}
		
		Clock2 secondClock = new Clock2(3,30,55);
		for(int i = 0; i < 10; i++) {
			secondClock.tick();
			System.out.println("Second: " + secondClock.toString());
		}
		
		System.out.println("\nAdd Clock\n");
		firstClock.addClock(secondClock);
		System.out.println("First: " + firstClock.toString());
		System.out.println("Second: " + secondClock.toString());
		
		System.out.println("\nThird Clock\n");
		Clock2 thirdClock = new Clock2();
		System.out.println("First: " + firstClock.toString());
		System.out.println("Second: " + secondClock.toString());
		thirdClock = firstClock.subtractClock(secondClock);
		System.out.println(thirdClock.toString());
	}
}
