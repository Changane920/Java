import java.util.Scanner;

public class Random_Test {
	public static void main(String[] args) {
		int random = (int) (Math.random()*100 + 1);
		int count = 0;
		
		System.out.println("Enter a number 1 to 100!");
		for(int i = 1; i <= 5; i++) {
			//user input
			Scanner input = new Scanner(System.in);
			int num = input.nextInt();
			
			if(num > 100) {
				System.out.println("Your number is greater than random number.");
				count++;
			}
			if(num < 1) {
				System.out.println("Your number is less than random number.");
				count++;
			}
			if(random != num) {
				System.out.println("No match");
				count++;
			} 
			else {
				System.out.println("Match");
				count--;
			}			
		}
		
		if(count <= 5) {
			System.out.println("-----------------");
			System.out.println("Fail!");
			System.out.println("-----------------");
			System.out.println("Random number is: " + random);
			count = 0;
		}
		else {
			System.out.println("Congratulation!");
			System.out.println("Random number is: " + random);
			count = 0;
		}
	}
}
