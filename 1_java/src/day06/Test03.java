package day06;

public class Test03 {

	public static void main(String[] args) {
		int a = 100;
		int b = 10;
		
		System.out.println(new Test03().max(a, b));
	}
	
	public int max(int a, int b) {
		return a>b?a:b;
	}

}
