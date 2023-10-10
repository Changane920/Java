package File_text;

import java.io.File;
import java.io.IOException;

public class Create_File {
	public static void main(String[] args) {
		File f = new File("D:\\KBTC\\JavaWS\\First_File_1.txt");
		try {
			if(f.createNewFile()) {
				System.out.println("File Created! " + f.getName());
			}
			else {
				System.out.println("Plese try again with another name!");
			}
		} catch (IOException e) {
			System.out.println("Something wrong!");
			e.printStackTrace();
		}
	}
}
