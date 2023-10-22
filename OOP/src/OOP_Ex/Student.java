package OOP_Ex;

public class Student {
	private String id, name;
	private double score;
	
	public String getId() {
		return this.id;
	}
	public void setId(String s) {
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
	
	public Student(String i, String n) {
		this.name = n;
		this.id = i;
		this.score = -1;
	}
	public Student(String i, String n, double s) {
		this.name = n;
		this.id = i;
		this.score = s;
	}
	
	public String withScore() {
		return "id is " + this.id + ", name is " + this.name + ", score is " + this.score;
	}
	
	public static void main(String[] args) {
		Student s1 = new Student("s01","Mg Mg");
		Student s2 = new Student("s02","Chochin",5);
		
		System.out.println(s1.withScore());
		System.out.println(s2.withScore());
	}
}
