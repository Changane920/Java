package Poly_EX_3;

public class Student {
	private String strStudentName,iStudentRegistraction,strBatchName;
	
	public String getStrtudentName() {
		return this.strBatchName;
	}
	public void setStudentName(String s) {
		this.strStudentName = s;
	}
	public String getIStudentRegistration() {
		return this.iStudentRegistraction;
	}
	public void setIStudentRegistration(String s) {
		this.iStudentRegistraction = s;
	}
	public String getStrBatchName() {
		return this.strBatchName;
	}
	public void setStrBatchName(String s) {
		this.strBatchName = s;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name: " + this.strStudentName + ", Regi: " + this.iStudentRegistraction + ",Batch: " + this.strBatchName;
	}
	
	public static void main(String[] args) {
		Student s = new Student();
		s.setStudentName("Chan");
		s.setIStudentRegistration("12");
		s.setStrBatchName("KoKo");
		System.out.println(s);
	}
}
