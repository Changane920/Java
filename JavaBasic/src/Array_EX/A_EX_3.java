package Array_EX;

public class A_EX_3 {
	public static void main(String[] args) {
		int[] array = new int[5];
		
		for(int i = 0; i < array.length; i++) {
			if(i%2 != 0) {
				array[i] = 1;
			}
			else {
				array[i] = i;
			}
		}
		
		for(int i = 0; i < array.length; i++) {
			System.out.println("Index: " + i + " Element: " + array[i] + " ");
		}
	}
}
