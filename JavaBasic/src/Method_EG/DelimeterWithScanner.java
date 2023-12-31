package Method_EG;

import java.util.Scanner;

public class DelimeterWithScanner {
	public static void main(String[] args) {
		String input = "10 fish 20 fish green fish white fish";
		Scanner sc = new Scanner(input);
		sc.useDelimiter(" ");

		while(sc.hasNext()) {
			System.out.println(sc.next());
		}
		
		sc.close();
		//output -- 10 20 green white
		
		System.out.println("\nSplit with .next() method");
		Scanner sc2 = new Scanner(input);
		
		while(sc2.hasNext()) {
			System.out.print(sc2.next());
		}
	}
}
