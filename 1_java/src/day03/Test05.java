package day03;
import java.util.Scanner;
import java.util.Date;

public class Test05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextLong();
		long sum = 0;
		
		Date date = new Date();
		long start = date.getTime();
		for(long i = 1; i <= n; i++) {
			sum += i;
			/*
			 * System.out.print(i); System.out.print(" : "); System.out.print(n);
			 * System.out.println();
			 */
			//if(i%2==0)sum += i;
			//System.out.print(i+"+");
		}
		long end = date.getTime();
		System.out.printf("%d : %d\n", end-start, sum);
		
		start = date.getTime();
		sum = n*(n+1)/2;
		end = date.getTime();
		System.out.printf("%d : %d\n", end-start, sum);
		
		System.out.println("==========================");
		
		/*
		 * for(int i = 0; i < 5; i++) { for(int j = 0; j < 13; j++)
		 * System.out.printf("i = %2d, j = %2d\n", i, j); }
		 */
		scanner.close();
	}

}
