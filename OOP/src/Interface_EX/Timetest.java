package Interface_EX;

import java.util.Date;

public class Timetest {
	public static void main(String[] args) {
		try {
	        while (true) {
	            System.out.println(new Date());
	            Thread.sleep(1 * 1000);
	        }
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	}
}
