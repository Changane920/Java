package File_text;

import java.io.FileWriter;
import java.io.IOException;

public class Write_File {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("D:\\KBTC\\JavaWS\\First_File.txt");
			fw.write("Hello World!");
			fw.append("\nKo ni chi wa!"); // add new line
			System.out.println("Success!");
			fw.close();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
