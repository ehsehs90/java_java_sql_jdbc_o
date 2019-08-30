package day05;

import java.net.URL;

public class Test03 {

	public static void main(String[] args) {
		Time t1 = new Time();
		t1.setHour(14);
		t1.setMinute(20);
		t1.print();
		
		try {
			URL url = new URL("www.naver.com");
		}
		catch(Exception e) {}
		
		
		
	}

}	

class Time {
	private int hour;
	private int minute;
	private boolean am;
	
	public int getHour() {
		return hour;
	}
	
	public void setHour(int hour) {
		if(hour >=0 && hour <= 23)
			this.hour = hour;
		else
			throw new TimeInputException();
	}
	
	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if(minute >=0 && minute <= 59)
			this.minute = minute;
		else
			throw new TimeInputException();
	}
	
	public boolean isAm() {
		return hour > 12;
	}

	public void print() {
		System.out.printf("[%2d:%2d]\n", this.hour, this.minute);
	}
}


  class TimeInputException extends Error{}
 