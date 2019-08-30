package day05;

public class Calc {
	public static int add(int a, int b) {
		return a + b;
	}
	
	public static double add(int a, double b) {
		return a + b;
	}
	
	public static double add(double a, int b) {
		return a + b;
	}
	
	public static int add(int ... a) {
		int sum = 0;
		for(int e:a)sum+=e;
		return sum;
	}
	
	public static int sub(int a, int b) {
		return a - b;
	}
	
	public static int mul(int a, int b) {
		return a * b;
	}
	
	public static double div(int a, int b) {
		return (double)a/b;
	}
}
