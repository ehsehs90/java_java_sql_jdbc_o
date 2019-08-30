package day09.exception;

public class Test03 {

	public static void main(String[] args) {
		System.out.println("start");
		
		for(int i = 0; i < 10; i++) {
			System.out.println("--------------");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("end");
		
	}

}
