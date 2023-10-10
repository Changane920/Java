package File_text;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;

public class getLineNumber {
	public static void main(String[] args) throws IOException {
		String str = "";
		FileInputStream fi = new FileInputStream("fileData\\Text1");
		LineNumberReader reader = new LineNumberReader(new InputStreamReader(fi,"UTF-8"));
		while(((str = reader.readLine()) != null) && reader.getLineNumber() <= 3 ) {
			System.out.println(str);
		}
		reader.close();
	}
}
