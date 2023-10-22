package OOP_Ex;

import java.util.Scanner;

public class StudentGroup {
	Student[] sgroup;
		
	public StudentGroup(int i) {
		sgroup = new Student[i];
	}
	
	//with score
	public void addStudent(String i, String n, double s, int an) {
		Student s1 = new Student(i,n,s);
		sgroup[an] = s1;
	}
	//without score
	public void addStudent(String i, String n, int an) {
		Student s1 = new Student(i,n);
		sgroup[an] = s1;
	}
	
	int num = 0;
	//search with id
	public void updateScore(String id, double score, int ai) {
		for(int a = 0; a < ai; a++) {
			if(sgroup[a].getId().equalsIgnoreCase(id)) {
				sgroup[a].setScore(score);
			}
		}
	}
	
	public void printArray() {
		System.out.println("Id\tName\tScore");
		for(int i = 0; i < num; i++) {		
			System.out.println(sgroup[i].getId() + "\t" + sgroup[i].getName() + "\t" + sgroup[i].getScore());
		}
	}

	//test debug
	public static void main(String[] args) {
		int temp = 3;
		String uid,uname ;
		double uscore;
		char uq = 0;
		
		StudentGroup s = new StudentGroup(temp);
		
		Scanner sc = new Scanner(System.in);
		
		do {						
			if(s.num < temp) {
				System.out.print("Enter id: ");
				uid = sc.next();
				System.out.print("Enter name: ");
				uname = sc.next();
				uname += sc.nextLine(); //accept space
				System.out.print("Enter score:");
				uscore = sc.nextDouble();			
				
				System.out.print("\nDo u want to add(y or no): ");
				uq = sc.next().charAt(0);
				System.out.println();
				
				s.addStudent(uid,uname,uscore,s.num);			
				s.num++;				
				
				s.updateScore("0",100,s.num);
				s.updateScore("1",50.555,s.num);
			}
			else {
				s.printArray();
				throw new StringIndexOutOfBoundsException();
			}
		} while(uq == 'y');
		
		s.printArray();

		sc.close();
	}
}
