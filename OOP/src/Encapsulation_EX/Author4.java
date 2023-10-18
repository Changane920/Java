package Encapsulation_EX;

public class Author4 {
	private String firstName, lastName;
	
	public Author4(String f, String l) {
		this.firstName = f;
		this.lastName = l;
	}
	
	public void setFirstName(String f) {
		this.firstName = f;
	}
	public void setLastName(String l) {
		this.lastName = l;
	}
	public String getFirstName(String f) {
		return this.firstName;
	}
	public String getLastName(String l) {
		return this.lastName;
	}
	
	@Override
	public String toString() {
		return "Author's firstname: " + this.firstName + ", lastName: " + this.lastName; 
	}
}

