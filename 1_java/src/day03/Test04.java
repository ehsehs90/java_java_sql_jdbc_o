package day03;

public class Test04 {

	public static void main(String[] args) {
		for(int i = 0; i < 5; i++)
			System.out.println(i+" Hello");
		
		int i = 10;
		while(i > 5) System.out.println(i-- +" while loop");
		
		do System.out.println(i++ +" while loop");
		while(i < 10);
		
		boolean flag = false;
		while(!flag) {
			i--;
			System.out.println("loop~~~");
			if(i == 0) flag = true;
		}
	}

}
