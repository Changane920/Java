package Array_EX;

public class A_EX_2 {
	public static void main(String[] args) {
		int[] array = {2,20,3,13,15,3,9,10,1,5,8};
		int count = 0;
		
		for(int i = 0 ; i < array.length; i++) {
			if(array[i] % 2 != 0) {
				count++;
			}
		}
		
		System.out.println("There are " + count + " odd numbers in this array.");
	}
}
