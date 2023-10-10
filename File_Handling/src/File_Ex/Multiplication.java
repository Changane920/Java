package File_Ex;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class Multiplication {
	public static void main(String[] args) {
		int i = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		System.out.print("Enter a file name: ");
		String str = sc.next();
		
		File f = new File("D:\\KBTC\\JavaWS\\"+ num + "_" + str +".txt");
		if(f.exists()) {
			try {
				System.out.println("File Already Exist.");
				FileReader fr = new FileReader(f);

				while((i = fr.read()) != -1) {
					System.out.print((char) i);
				}
				fr.close();
			} 
			catch (IOException e) {
				System.out.println("Read error");
				e.printStackTrace();
			}
		}
		else {
			try {
				if(f.createNewFile()) {
					System.out.println("Hi I'm here.");
					FileWriter fw = new FileWriter(f);

					for(int g = 1; g <= 12; g++) {
						fw.append(num + " * " + g + "\t= " + num*g + "\n");
					}

					System.out.println("Create Successful!");
					fw.close();
				}
			}
			catch (IOException e) {
				System.out.println("Create Error!");
				e.printStackTrace();
			}
		}
		
		//get a date of last update
		long m_d = f.lastModified();
		System.out.println(new Date(m_d));
		sc.close();
	}
}
