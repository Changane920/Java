package File_text;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileOwnerAttributeView;
import java.nio.file.attribute.UserPrincipal;
import java.util.Scanner;

public class getPath {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter file path!");
		String p = sc.next();
		Path path = Paths.get(p);
		
		FileOwnerAttributeView view = Files.getFileAttributeView(path, FileOwnerAttributeView.class);
		UserPrincipal user = view.getOwner();
		System.out.println(user);
	}
}
