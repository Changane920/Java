package Array_EX;

import java.util.Arrays;

public class A_EX_6_2 {
	public static void main(String[] args) {
		int[] array = {4, 5, 1, 3, 8};
		Arrays.sort(array);
		int mid = Arrays.binarySearch(array,0);
		boolean flag = false;
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] == mid) {
				flag = true;
			}
		}
		
		if(flag) {
			System.out.println("Found!");
		}
		else {
			System.out.println("Not Found!");
		}
	}
}
