package Encapsulation_EX;

public class Ball {
	public static void main(String[] args) {
		Move ball = new Move(10,10,5,-5,1);

		float xMin = 0.0f;
		float xMax = 100.0f;
		float yMin = 0.0f;
		float yMax = 50.0f;
		
		for(int i = 0; i < 15; i++) {
			ball.move();
			System.out.println(ball);
			
			float xNew = ball.getX();
			float yNew = ball.getY();
			int radius = ball.getRadius();
			
			//check boundary box
			if((xNew + radius) > xMax || (xNew - radius < xMin)) {
				ball.reflectHorizontal();
			}
			if((yNew + radius) > yMax || (yNew - radius) < yMin){
				ball.reflectVertical();
			}
		}
	}

}
class Move{
	private float x, y, xDelta, yDelta;
	private int radius;
	
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
	public float getxDelta() {
		return xDelta;
	}
	public void setxDelta(float xDelta) {
		this.xDelta = xDelta;
	}
	public float getyDelta() {
		return yDelta;
	}
	public void setyDelta(float yDelta) {
		this.yDelta = yDelta;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	Move(float x, float y, float xD, float yD, int r){
		this.x = x;
		this.y = y;
		this.xDelta = xD;
		this.yDelta = yD;
		this.radius = r;
	}
	
	void move() {
		x += xDelta;
		y += yDelta;
	}
	void reflectHorizontal() {
		xDelta = -xDelta;
	}
	void reflectVertical() {
		yDelta = -yDelta;
	}
	
	@Override
	public String toString() {
		return "Ball[(" + getX() + "," + getY() + "), speed = (" + getxDelta() + "," + getyDelta() + ")]";
	}
}