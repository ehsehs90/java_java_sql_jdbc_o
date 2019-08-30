package day04;

import java.util.Arrays;

public class Test05 {

	public static void main(String[] args) {
		/*System.out.println(args);
		System.out.println(args.length);
		System.out.println(Arrays.toString(args));*/
		
		if(args.length == 0) {
			System.out.println("사용방법");
			System.out.println("java day04.Test05 홍길동/90/70/30");
			System.out.println("성적 데이터를 입력해주세요..");
			return;
		}
		System.out.println("성적처리");
		String[] data = args[0].split("/");
		System.out.println(Arrays.toString(data));
		
		double m = 0;
		for(int i = 1; i < data.length; i++)
			m += Integer.parseInt(data[i]);
		m/=3;
		System.out.printf("학생이름 : %s\n평균 : %.2f", data[0], m);
	}

}
