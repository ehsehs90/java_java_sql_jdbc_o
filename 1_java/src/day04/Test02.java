package day04;

import java.util.Arrays;
import java.util.Date;

public class Test02 {

	public static void main(String[] args) {
		int[] num = new int[5];
		for(int i = 0; i < num.length; i++) {
			num[i] = (int)(Math.random()*100);
		}
		System.out.println(Arrays.toString(num));/*
		int[] num2 = num;
		num[0] = 0;
		System.out.println(Arrays.toString(num2));*/
		
		int[] num3 = num.clone();
		System.out.println();
	}

}
