package OOP_Ex;

public class Student {
	private int id;
	private String name;
	private double score;
	
	public int getId() {
		return this.id;
	}
	public void setId(int s) {
		this.id = s;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String s) {
		this.name = s;
	}
	public double getScore() {
		return this.score;
	}
	public void setScore(double s) {
		this.score = s;
	}
	
	public Student(int i, String n) {
		this.name = n;
		this.id = i;
		this.score = -1;
	}
	public Student(int i, String n, double s) {
		this.name = n;
		this.id = i;
		this.score = s;
	}
	
	public Student withScore(Double nScore) {
		return new Student(this.id,this.name,nScore);
	}
	
	@Override
	public String toString() {
		return String.format("id: %d, name: %s, score: %s", id,name,score < 0 ?"No Score":score);
	}
	
	public static void main(String[] args) {
		Student s1 = new Student(0,"chan");
		Student s2 = new Student(1,"myae",5);
		
		System.out.println(s1);
		System.out.println(s2);
	}
}
