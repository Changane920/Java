package Encapsulation_EX;

public class Author2 {
	private String name, email;
	private char gender;
	
	Author2(String n, String e, char g){
		this.setName(n);
		this.setEmail(e);
		this.setGender(g);
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "Author [name = " + name + ",email = " + email + ",gender = " + gender + "]";
	}
}
