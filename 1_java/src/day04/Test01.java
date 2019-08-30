package day04;

import java.util.Arrays;

public class Test01 {

	public static void main(String[] args) {
		int count;
		int[] jumsu = new int[5];
		double m = 0;
		
		jumsu[0] = 90;
		jumsu[1] = 80;
		jumsu[2] = 77;
		jumsu[3] = 60;
		jumsu[4] = 50;
		System.out.println(Arrays.toString(jumsu));
		
		String[] names = new String[5];
		names[0] = "홍길동";
		names[1] = "김길동";
		names[2] = "최길동";
		names[3] = "";
		System.out.println(Arrays.toString(names));
		
		for(int i = 0; i < jumsu.length; i++) {
			m += jumsu[i];
			String temp;
			if(names[i] != null && names[i].length() > 0)
				temp = names[i].charAt(0)+"**";
			else
				temp = "이름없음";
			System.out.printf("%s\t %d\n", temp, jumsu[i]);
		}
		m/=jumsu.length;
		System.out.printf("%s \t%.2f","평균", m);
		
	}

}
