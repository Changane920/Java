package Inheritance;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Inherit_Login {
	public static void main(String[] args) throws IOException {
		Login l = new Login();
		
		Scanner sc = new Scanner(System.in);
		
		File f = new File("D:\\KBTC\\JavaWS\\Login.txt");
		
		if(f.exists()) {
			System.out.print("Enter a name: ");
			String uname = sc.next();
			System.out.print("Enter password: ");
			String upass = sc.next();
			l.login(uname, upass);			
		}
		else {
			System.out.println("Register name: ");
			String uname = sc.next();
			System.out.println("Register pass: ");
			String upass = sc.next();
			l.register(uname, upass);		
		}
	}
}
class Login {
	private String name;
	private String pass;
	
	public String getName() {
		return this.name;
	}
	public void setName(String n) {
		this.name = n;
	}
	public String getPass() {
		return this.pass;
	}
	public void setPass(String p) {
		this.pass = p;
	}
	
	public void login(String n, String p) throws IOException {
		this.name = Files.readAllLines(Paths.get("D:\\KBTC\\JavaWS\\Login.txt")).get(0);
		this.pass = Files.readAllLines(Paths.get("D:\\KBTC\\JavaWS\\Login.txt")).get(1);
		
		if(this.name.equalsIgnoreCase(n) && this.pass.equalsIgnoreCase(p)) {
			System.out.println("Login success");
		}
		else {
			System.out.println("Login fail");
		}
	}
	
	public void register(String n, String p) throws IOException {
		FileWriter fw = new FileWriter("D:\\KBTC\\JavaWS\\Login.txt");
		fw.append(n + "\n" + p);
		fw.close();
	}
	
}
