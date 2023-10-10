package Object_Class;

public class StudentTest {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.name = "Aung Aung";
		s1.age = 12;
		s1.sub1 = 10;
		s1.sub2 = 20;
		s1.sub3 = 30;
		System.out.print("Name of first student is " + s1.name + ". Age is " + s1.age + ". Total Mark is ");
		s1.TotalMark(s1.sub1, s1.sub2, s1.sub3);
		System.out.print(".\n");
		
		s2.name = "Cho Chin";
		s2.age = 20;
		System.out.print("Name of first student is " + s2.name + ". Age is " + s2.age + ". Total Mark is ");
		s2.TotalMark(10, 10, 10);
		System.out.print(".");
	}
}
