package Interface_EX;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Ex_2_Timer implements TimeClient { 

	@Override
	public void setTime(int hour, int minute, int second) {
		
	}

	@Override
	public void setDate(int date, int month, int year) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setDateTime(int hour, int minute, int second, int date, int month, int year) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		
		int hour = d.getHours();
		System.out.println(hour);
		int min = d.getMinutes();
		System.out.println(min);
		int sec = d.getSeconds();
		System.out.println(sec);

		LocalDateTime lt = LocalDateTime.now();
		System.out.println(lt);
		
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
	}
}
