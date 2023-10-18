package Inherit_EX;

public class Person1 {
	private String name,add,ph,email;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public String getPh() {
		return ph;
	}
	public void setPh(String ph) {
		this.ph = ph;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "ClassName: " + getClass()+
				"\nPerson.name : " + name +
				"\nPserson.address: " + add +
				"\nPerson.phone: " + ph +
				"\nPerson.email: " + email;
	}
	
	public static void main(String[] args) {
		Person1 p1 = new Person1();
		p1.setName("Chan");
		p1.setAdd("Yangon");
		p1.setPh("0909");
		p1.setEmail("email.com");
		System.out.println(p1);
		
		Employee1 e1 = new Employee1();
		e1.setOffice("Yoyo");
		e1.setDate("25/2/2000");
		e1.setSalary(500);
		System.out.println(e1);
		
		Student1 st1 = new Student1();
		st1.setStatus(3);
		System.out.println(st1);
		
		Faculty1 f1 = new Faculty1();
		System.out.println(f1);
	}
}
