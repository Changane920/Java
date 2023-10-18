package Inherit_EX;

public class Employee1 extends Person1{
	private String office, date;
	public double salary;
	
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "\nClassName: " + getClass() +
				"\nEm.Office: " + office +
				"\nEm.Date: " + date +
				"\nEm.salary: " + salary;
	}
	
}
