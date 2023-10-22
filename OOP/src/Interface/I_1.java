package Interface;

public class I_1 {
	public static void main(String[] args) {
		Pig myPig = new Pig();
		myPig.animalSound();
		myPig.Sleep();
	}
}

interface Animal{
	public void animalSound();
	public void Sleep();
}

class Pig implements Animal{
	@Override
	public void animalSound() {
		System.out.println("The pig says: wee wee");		
	}
	@Override
	public void Sleep() {
		System.out.println("Zzz");
	}
	
}
