package File_text;

import java.io.File;

public class Delete_File {
	public static void main(String[] args) {
		File f = new File("D:\\KBTC\\JavaWS\\First_File_1.txt");
		if(f.delete()) {
			System.out.println("Finish!");
		}
		else {
			System.out.println("File no longer exist.");
		}
	}
}
