package Constructor_Exercise;

public class C_4 {
	public static void main(String[] args) {
		SchoolBoy[] array = new SchoolBoy[3];
		
		array[0] = new SchoolBoy("Peter", "p@gmail.com", 3);
		array[1] = new SchoolBoy("John", "j@gmail.com",4);
		array[2] = new SchoolBoy("Lisa", "l@gmail.com",5);
		
		for(SchoolBoy i : array) {
			System.out.println(i);
		}
	}
}
class SchoolBoy{
	String name, mail;
	int grade;
	SchoolBoy(String Name, String  Mail, int Grade){
		name = Name;
		mail = Mail;
		grade = Grade;
	}
	@Override
	public String toString() {
		return name + "\t" + grade + "\t" + mail;
	}
}
