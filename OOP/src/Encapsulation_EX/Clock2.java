package Encapsulation_EX;

public class Clock2 {
	private int hours, minutes, seconds;
	
	Clock2(){
		
	}
	Clock2(int h, int m, int s){
		this.hours = h;
		this.minutes = m;
		this.seconds = s;
	}
	Clock2(int s){
		if(seconds <= 60) {
			this.seconds = s;			
		}
		else {
			minutes += seconds/60;
			seconds = seconds % 60;
		}
		if(seconds == 0) {
			minutes--;
			seconds = 60;
		}
		else {
			this.seconds = s;
		}
	}
	
	public int setClock(int s) {
		return this.seconds = s;
	}
	
	public int getHours() {
		return hours;
	}
	public int getMinutes() {
		return minutes;
	}
	public int getSeconds() {
		return seconds;
	}
	public int setHours(int h) {
		return this.hours = h;
	}
	public int setMinutes(int m) {
		return this.minutes = m;
	}
	public int setSeconds(int s) {
		return this.seconds = s;
	}

	public void tick() {
		if(seconds < 60) {
			seconds++;			
		}
		else {
			minutes++;
			seconds = 0;
		}
	}
	public void tickDown() {
		if(seconds >= 1) {
			seconds--;
		}
		else {
			minutes--;
			seconds = 60;
		}
	}

	public void addClock(Clock2 c) {
		this.hours += c.hours;
		this.minutes += c.minutes;
		this.seconds += c.seconds;
	}
	public Clock2 subtractClock(Clock2 c) {
		c.hours -= this.hours;
		c.minutes -= this.minutes;
		c.seconds -= this.seconds;
		
		//seconds validation
		if(c.seconds <= 60) {
			c.seconds = c.seconds;			
		}
		else {
			c.minutes += c.seconds/60;
			c.seconds = c.seconds % 60;
		}
		
		if(c.seconds <= 0) {
			c.minutes--;
			c.seconds += 60;
		}
		else {
			c.seconds = c.seconds;
		}
		return c;
	}
	
	@Override
	public String toString() {
		return "hh: " + hours + " mm: " + minutes + " ss: " + seconds; 
	}
}
