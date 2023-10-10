package Constructor;

public class student {
	String rollNo,name;
	int sub1, sub2, sub3, total;

	student(String RollNo, String Name, int Sub1, int Sub2, int Sub3) {
		this.name = Name;
		this.rollNo = RollNo;
		this.sub1 = Sub1;
		this.sub2 = Sub2;
		this.sub3 = Sub3;
		this.total = this.sub1 + this.sub2 + this.sub3;
	}
	public String toString() {
		return rollNo + "\t" + name + "\t" + sub1 + "\t" + sub2 + "\t" + sub3 + "\t" + total;
	}
}
