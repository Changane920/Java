package For_Loop;

public class FL_Odd_Num {
	public static void main(String[] args) {
		int count = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 2 != 0) {
				System.out.print(i + ",");
				count++;
			}
			if(count == 5) {
				System.out.println();
				count = 0;
			}
		}
		
		//even number sum
		System.out.println("even number sum");
		int even = 0;
		for(int i = 2; i <= 100; i++) {
			if(i % 2 == 0) {				
				even += i;
			}
		}
		System.out.println(even);
	}
}
