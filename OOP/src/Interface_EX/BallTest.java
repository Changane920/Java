package Interface_EX;

public class BallTest{
	public static void main(String[] args) {
		Baseball b = new Baseball("H");
		b.toss();
		b.bounce();
		
		Rock r = new Rock();
		r.toss();
	}
}
