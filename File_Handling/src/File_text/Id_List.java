package File_text;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Id_List {
	static int st_no, Sub1, Sub2, Sub3;
	static String name;
	static Scanner sc;
	static String[][] array;
	static char ch;
	static int count = 0;

	public static void main(String[] args) throws IOException {
		int row = 4;
		int col = 6;
		array = new String[row][col];

		sc = new Scanner(System.in);

		do {
			userInput();
			
			if(count < row) {
				addData(count);				
			}
			else {
				System.out.println("\nCan't add anymore. Storage full!");
				break;
			}

			System.out.println("\nDo you want to add another student?");
			ch = sc.next().charAt(0);

			count++;
			
			printArray(count);
			System.out.println();
		} while (ch == 'y');
		
		File f = new File("D:\\KBTC\\JavaWS\\TwoD.txt");
		FileWriter fw = new FileWriter(f);
		
		fw.append("\nSt_no\t" + "Name\t" + "Sub1\t" + "Sub2\t" + "Sub\t\n");
		for (int i = 0; i < count; i++) {
			for (int x = 1; x < array[i].length; x++) {
				fw.append(array[i][x] + "\t");
			}
			fw.append("\n");
		}
		System.out.println("Success");
		
		fw.close();
	}

	static void userInput() {
		System.out.print("Enter student no: ");
		st_no = sc.nextInt();
		System.out.print("Enter student name: ");
		name = sc.next();
		System.out.print("Enter Sub1 Mark: ");
		Sub1 = sc.nextInt();
		System.out.print("Enter Sub2 Mark: ");
		Sub2 = sc.nextInt();
		System.out.print("Enter Sub3 Mark: ");
		Sub3 = sc.nextInt();
	}

	static void printArray(int count) {
		System.out.println("\nSt_no\t" + "Name\t" + "Sub1\t" + "Sub2\t" + "Sub\t");
		for (int row = 0; row < count; row++) {
			for (int col = 1; col < array[row].length; col++) {
				System.out.print(array[row][col] + "\t");
			}
			System.out.println();
		}
	}

	static void addData(int count) {
		for (int row = count; row <= count; row++) {
			for (int column = 1; column < array[row].length; column++) {
				switch (column) {
				case 1:
					array[row][column] = String.valueOf(st_no);
					break;
				case 2:
					array[row][column] = name;
					break;
				case 3:
					array[row][column] = String.valueOf(Sub1);
					break;
				case 4:
					array[row][column] = String.valueOf(Sub2);
					break;
				case 5:
					array[row][column] = String.valueOf(Sub3);
					break;
				}
			}
		}
	}
}
