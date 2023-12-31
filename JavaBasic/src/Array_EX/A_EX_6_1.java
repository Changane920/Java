package Array_EX;

import java.util.Arrays;

public class A_EX_6_1 {
	static boolean flag = false;
	public static void main(String[] args) {
		int[] array = {5,4,2,3,1};
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		binarySearch(array,11);
		
		if(flag) {
			System.out.println("Found!");
		}
		else {
			System.out.println("Not Found");
		}
	}

	static void binarySearch(int[] array, int key) {
		int start = 0;
		int end = array.length - 1;
		while(start <= end) {
			int mid = (start + end)/2;
			if(array[mid] == key) {
				flag = true;
				break;
			}
			else if(array[mid] < key) {
				start = mid + 1;
			}
			else {
				end = mid - 1;
			}
			flag = false;
		}
	}
}
