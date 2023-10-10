package Constructor;


public class studentTest {
	public static void main(String[] args) {
		System.out.print("RollNo\t" + "Name\t\t" + "Sub1\t" + "Sub2\t" + "Sub3\t" + "Total\n");

		student s1 = new student("1","Aung Aung",10,20,30);
		System.out.println(s1.toString());
		
		student s2 = new student("2","Cho Mhar",11,12,13);
		System.out.println(s2.toString());
	}
}
