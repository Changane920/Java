package Encapsulation_EX;

public class Average_3_sub {
	public static void main(String[] args) {
		Mark m1 = new Mark("Hay Luu",85,75,90);
		System.out.println(m1.toString());
	}
}
class Mark{
	private String name;
	private int phy,chem,bio;
	
	public int getPhy() {
		return this.phy;
	}
	public void setPhy(int p) {
		this.phy = p;
	}
	public int getChem() {
		return this.chem;
	}
	public void setChem(int c) {
		this.chem = c;
	}
	public int getBio() {
		return this.bio;
	}
	public void setBio(int b) {
		this.bio = b;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String n) {
		this.name = n;
	}
	
	public Mark(String n, int p, int c, int b) {
		this.name = n;
		this.phy = p;
		this.chem = c;
		this.bio = b;
	}
	
	public double getAverage() {
		return (this.phy + this.chem + this.bio) / 3.0;
	}
	
	@Override
	public String toString() {
		return "Student's Name: " + name + "\nPhysics: " + phy + "\nChemistry: " + chem + "\nBiology: " + bio + "\nAverage: " + getAverage();
	}
}
