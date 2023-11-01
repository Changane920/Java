package OOP_Ex;

import java.util.Scanner;

public class StudentGroup {
	Student[] sgroup;
		
	public StudentGroup(int i) {
		sgroup = new Student[i];
	}
	
	//with score
	public void addStudent(int i, String n, double s, int an) {
		Student s1 = new Student(i,n,s);
		sgroup[an] = s1;
	}
	//without score
	public void addStudent(int i, String n, int an) {
		Student s1 = new Student(i,n);
		sgroup[an] = s1;
	}
	
//	--teacher way--
//	int index = 0;
//	public void addStudent(Student...addtoStudent) {
//		for(Student std:addtoStudent) {
//			if(index == sgroup.length) {
//				throw new IllegalStateException()
//			}
//			sgroup[index++] = std;
//		}
//	}
	
	int num = 0;
	//search with id
	public void updateScore(int id, double score, int ai) {
		for(int a = 0; a < ai; a++) {
			if(sgroup[a].getId() == id) {
				sgroup[a].setScore(score);
			}
		}
	}	
	
// 	My own way (Bubble sort)
//	public void sort(Student[] s, int ai) {
//		for(int i = 0; i < ai - 1; i++) {
//			for(int j = 0; j < ai - i - 1; j++) {
//				String fstr = String.valueOf(s[j].getId());
//				String sstr = String.valueOf(s[j+1].getId());
//				
//				if(fstr.compareTo(sstr) > 0) {
//					Student temp = s[j];
//					s[j] = s[j+1];
//					s[j+1] = temp;
//				}
//			}
//		}
//	}
	//ascending
	public void sort(SortOrder order, int ai) {
		for(int i = 0; i < ai - 1; i++) {
			for(int j = 0; j < ai - i - 1; j++) {
				if(order.compare(sgroup[j], sgroup[j+1]) > 0) {
					Student temp = sgroup[j];
					sgroup[j] = sgroup[j+1];
					sgroup[j+1] = temp;
				}
			}
		}
	}
	//descending
	public void sortDesc(SortOrder order, int ai) {
		for(int i = 0; i < ai - 1; i++) {
			for(int j = 0; j < ai - i - 1; j++) {
				if(order.compare(sgroup[j], sgroup[j+1]) < 0) {
					Student temp = sgroup[j];
					sgroup[j] = sgroup[j+1];
					sgroup[j+1] = temp;
				}
			}
		}
	}

	@Override
	public String toString() {
		StringBuilder rec = new StringBuilder();
		for(int i = 0; i < num; i++) {
			rec.append(sgroup[i]).append(System.lineSeparator());
		}
		return rec.toString();
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
		int uid;
		String uname ;
		double uscore;
		char uq = 0;
		
		StudentGroup s = new StudentGroup(temp);
		
		try (Scanner sc = new Scanner(System.in)) {
			do {						
				if(s.num < temp) {
					System.out.print("Enter id: ");
					uid = sc.nextInt();
					System.out.print("Enter name: ");
					uname = sc.next();
					uname += sc.nextLine(); //accept space
					System.out.print("Enter score:");
					uscore = sc.nextDouble();			
					
					System.out.print("\nDo u want to add(y or n): ");
					uq = sc.next().charAt(0);
					System.out.println();
					
					s.addStudent(uid,uname,uscore,s.num);			
					s.num++;				
					
					s.updateScore(0,100,s.num);
					s.updateScore(1,50.555,s.num);
				}
				else {
					s.printArray();
					throw new StringIndexOutOfBoundsException();
				}
			} while(uq == 'y');
						
			System.out.println("Sort by ID!");
			s.sort(SortOrder.BY_ID, s.num);
			System.out.println(s);
			
			System.out.println("Sort by NAME!");
			s.sort(SortOrder.BY_NAME, s.num);
			System.out.println(s);
			
			System.out.println("Sort by SCORE!");
			s.sortDesc(SortOrder.BY_SCORE, s.num);
			System.out.println(s);

			sc.close();
		}
	}
}
