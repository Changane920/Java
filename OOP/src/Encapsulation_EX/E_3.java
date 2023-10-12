package Encapsulation_EX;

public class E_3 {
	public static void main(String[] args) {
		Employee e = new Employee();
		System.out.println(e);
	}
}
class Employee{
	private int id,salary;
	private String firstName,lastName;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	Employee(){
		firstName = "Ko";
		lastName = "Maung Maung";
		id = 12;
		salary = 10000;
	}
	Employee(String fname, String lname, int id, int salary){
		this.firstName = fname;
		this.lastName = lname;
		this.id = id;
		this.salary = salary;
	}
	
	String getName() {
		return getFirstName() + getLastName();
	}
	
	int getAnualSalary() {
		return getSalary() * 12;
	}
	
	double raiseSalary(double percent) {
		salary += getSalary() * (percent/100);
		return salary;
	}
	
	@Override
	public String toString() {
		return "Id = " + getId() + "\tEmployee = " + getName() + "\tSalary = " + raiseSalary(5) + "\tAnualSalary: " + getAnualSalary(); 
	}
}