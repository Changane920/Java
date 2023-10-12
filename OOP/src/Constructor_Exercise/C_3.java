package Constructor_Exercise;

public class C_3 {
	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s);
		Student s1 = new Student("Mg Mg.");
		System.out.println(s1);
	}
}

class Student{
	String name;
	Student(){
		name = "Unknown.";
	}
	Student(String str){
		name = str;
	}
	@Override
	public String toString() {
		return "Your name is " + name;
	}
}
