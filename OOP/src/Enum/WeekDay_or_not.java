package Enum;


public class WeekDay_or_not {
	enum Day{
		Monday,
		Tuesday,
		Wednesday,
		Thursday,
		Friday,
		Saturaday,
		Sunday
	}
	public boolean WeekDay(String s) {
		if(s.equalsIgnoreCase("sunday") || s.equalsIgnoreCase("saturaday")) {
			return false;
		}
		return true;
	}
	public boolean HoliDay(String s) {
		if(s.equalsIgnoreCase("sunday") || s.equalsIgnoreCase("saturaday")) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		WeekDay_or_not myObj = new WeekDay_or_not();
		
		for(Day d : Day.values()) {
			System.out.println("Weekday of " + d + " is\t" + myObj.WeekDay(String.valueOf(d)));
		}
		System.out.println();
		for(Day d : Day.values()) {
			System.out.println("Holiday of " + d + " is\t" + myObj.HoliDay(String.valueOf(d)));			
		}
	}
}
