package Array_EX;

import java.util.Arrays;

public class A_EX_5_ {
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5};
		int[] array2 = new int[array.length - 1];
		int index = Arrays.binarySearch(array, 2);
		
		for(int i = 0, k = 0; i < array.length; i++) {
			if(i == index) {
				continue;
			}
			array2[k++] = array[i];
		}

		System.out.println(Arrays.toString(array2));
	}
}
