package Array_EG;

import java.util.Scanner;

public class A_EG_6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a row: ");
		int row = input.nextInt();
		System.out.print("Enter a column: ");
		int column = input.nextInt();
		System.out.println();
		
		int[][] array = new int[row][column];
		int count = 0;
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				array[i][j] = count;
				count++;
			}
		}
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		input.close();
	}
}
