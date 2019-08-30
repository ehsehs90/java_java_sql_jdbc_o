package day09.tv;

public class TVUser {

	public static void main(String[] args) {
		TV user;
		user = new STV();
		user.powerOn();
		
		user = new LTV();
		user.powerOn();
	}
	
	public static void tv(TV tv) {
		tv.powerOn();
	}

}
