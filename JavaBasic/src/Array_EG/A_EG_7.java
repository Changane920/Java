package Array_EG;

import java.util.Scanner;

public class A_EG_7 {	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter total number of row: ");
		int row = input.nextInt();
		
		System.out.print("Enter total number of column: ");
		int col = input.nextInt();
		
		int[][] array = new int[row][col];
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				System.out.print("Enter element for [" + i + "][" + j + "]: ");
				array[i][j] = input.nextInt();
			}
		}
		
		System.out.println("\nArray");
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("\nBoundary");
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length; j++) {
				if(i == 0 || i == row - 1 || j == 0 || j == col - 1) {
					System.out.print(array[i][j] + " ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		input.close();
	}
}
