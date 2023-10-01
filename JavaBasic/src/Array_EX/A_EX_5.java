package Array_EX;

import java.util.Scanner;

public class A_EX_5 {
	static int[] array;
	public static void main(String[] args) {
		//get user input
		getArray();
		System.out.println();
		
		//swapping
		bubbleSort(array);
		
		//output array
		printArray(array);
	}
	static void getArray() {
		Scanner sc = new Scanner(System.in);
		array = new int[5];
		for(int i = 0; i < array.length; i++) {
			System.out.print("Enter a elemnt " + i + " :");
			array[i] = sc.nextInt();
		}
	}
	static void bubbleSort(int[] arr) {
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = 0; j < arr.length - i - 1; j++) {
				if(arr[j] > arr[j+1]) {
					swap(j,j+1);					
				}
			}
		}
	}
	static void swap(int j, int j2) {
		int temp = array[j];
		array[j] = array[j2];
		array[j2] = temp;		
	}
	static void printArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
