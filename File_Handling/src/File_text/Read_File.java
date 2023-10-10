package File_text;

import java.io.FileReader;
import java.io.IOException;

public class Read_File {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("D:\\KBTC\\JavaWS\\First_File.txt");
			int i = 0;
			while((i = fr.read()) != -1) {
				System.out.print((char)i);
			}
			fr.close();
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
