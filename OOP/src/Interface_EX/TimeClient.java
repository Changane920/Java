package Interface_EX;

public interface TimeClient {
	void setTime(int hour, int minute, int second);
	void setDate(int date, int month, int year);
	void setDateTime(int hour, int minute, int second, int date, int month, int year);
	
}
