package Inherit_EX;

public class Student1 extends Person1 {
	private int status;
	
	public int getStatus() {
		return this.status;
	}
	public void setStatus(int s) {
		this.status = s;
	}
	@Override
	public String toString() {
		return "\nClassName: " + getClass() +
				"\nStudent.status: " + status;
	}
}
