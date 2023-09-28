package Array_EG;

public class A_EG_1 {
	public static void main(String[] args) {
		int[] array = {10,20,30,40,50};
		
		System.out.println("foreach loop");
		for (int i : array) {
			System.out.println(i);
		}
		
		System.out.println("\nfor loop");
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
