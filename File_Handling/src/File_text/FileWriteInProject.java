package File_text;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteInProject {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("fileData\\Text1");
		fw.write("Ko ni chi wa");
		fw.write("Hello World!");
		fw.close();
	}
}
