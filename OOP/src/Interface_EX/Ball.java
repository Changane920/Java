package Interface_EX;

interface Tossable{
	public void toss();
}

abstract class Ball{
	private String brandName;
	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String s) {
		this.brandName = s; 
	}

	public Ball(String brandName) {
		this.brandName = brandName;
	}

	abstract void bounce();
}

class Rock implements Tossable{

	@Override
	public void toss() {
		System.out.println("rock toss");		
	}
}

class Baseball extends Ball implements Tossable{

	public Baseball(String brandName) {
		super(brandName);
	}

	@Override
	public void toss() {
		System.out.println("baseball toss");		
	}

	@Override
	void bounce() {
		System.out.println("baseball bounce");
	}
}

abstract class Football extends Ball implements Tossable{

	public Football(String brandName) {
		super(brandName);
	}
}
