package day09.exception;

public class Test02 {

	public static void main(String[] args) {
		/*
		Exception e = new Exception("My Exception");
		
		try {
			System.out.println("start");
			throw e;
		}
		catch(Exception x) {
			System.out.println(x.getMessage());
			x.printStackTrace();
		}
		System.out.println("end");
		*/
		
		System.out.println("start");
		try {
			throw new Exception("My Exception");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("end");
	}

}
