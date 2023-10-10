package File_text;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Login {
	static FileInputStream fi;
	static LineNumberReader reader;
	static String str;
	static String username;
	static String password;
	
	public static void main(String[] args) throws IOException {
		fi = new FileInputStream("fileData\\Account");
		reader = new LineNumberReader(new InputStreamReader(fi,"UTF-8"));
		str = "";

		String username = Files.readAllLines(Paths.get("fileData\\Account")).get(0);
		System.out.println("Username: " + username); //debug
		String password = Files.readAllLines(Paths.get("fileData\\Account")).get(1);
		System.out.println("Password: " + password); //debug
		System.out.println("Function uname: " + Username());
		System.out.println("Function upass: " + Password());
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a username: ");
		String uname = sc.next();
		System.out.print("Enter a password: ");
		String upass = sc.next();
		
		//own
		/*
		 * if(uname.equalsIgnoreCase(username) && upass.equalsIgnoreCase(password)) {
		 * System.out.println("Login Successful!"); } else {
		 * System.out.println("Failed Login!"); }
		 */
		if(uname.equalsIgnoreCase(username)&& upass.equalsIgnoreCase(password)) {
			System.out.println("Login Successful!");
		}
		else {
			System.out.println("Login Fail!");
		}
		sc.close();
		reader.close();
		
		//
	}
	
	static String Username() throws IOException {
		while((str = reader.readLine())!= null && reader.getLineNumber() == 1) {
			System.out.println("Line number with getLineNumber: " + reader.getLineNumber());
			//System.out.println("Line number with readline: " + reader.readLine());
			username = str;
		}
		return username;
	}
	static String Password() throws IOException {
		System.out.println("Line number with getLineNumber: " + reader.getLineNumber());
		//System.out.println("Line number with readline: " + reader.readLine());
		password = str;
		return password;
	}
}
