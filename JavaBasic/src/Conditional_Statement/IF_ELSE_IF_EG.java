package Conditional_Statement;

import java.util.Random;

public class IF_ELSE_IF_EG {
	public static void main(String[] args) {
		Random random = new Random();
		int grade = random.nextInt(0,100);
		

		// if mark is greater than 80 is A
		// if mark is between 70 and 79 is B
		// if mark is between 60 and 69 is C
		// if mark is between 50 and 59 is D
		// if mark less than 50 is E		
		
		if(grade >= 80) { 
			System.out.println("Totoal Mark: " + grade + ". Grade A");
		} 
		else if(grade >= 70 && grade <= 79) {
			System.out.println("Total Mark: " + grade + ". Grade B.");
		}
		else if(grade >= 60 && grade <= 69) {
			System.out.println("Totoal Mark: " + grade + ". Grade C");
		}
		else if(grade >= 50 && grade <= 59) {
			System.out.println("Total Mark: " + grade + ". Grade D.");
		}
		else {
			System.out.println("Total Mark: " + grade + ". Grade E.");
		}
	}
}
