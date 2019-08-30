package day03;

public class Test06_GUGU {

	public static void main(String[] args) {
	OUT:for(int i = 1; i < 10; i++) {
			for(int j = 2; j < 10; j++) {
				if(j == 5) break OUT;
				System.out.printf("%d X %d = %2d|", j, i, j*i);
			}
			System.out.println();
		}
	}

}
