package day04;

import java.util.Arrays;

public class Test07 {

	public static void main(String[] args) {
		int[] num = new int[30];
		int[] lotto = new int[45];
		for(int i = 0; i < lotto.length; i++)
			lotto[i] = i+1;
		
		for(int i = 0; i < num.length; i++) {
			int k = (int)(Math.random()*(45-i));
			num[i] = lotto[k];
			int temp = lotto[k];
			lotto[k] = lotto[44-i];
			lotto[44-i] = temp;
		}
		
		System.out.println(Arrays.toString(num));
		
		for(int i = 0; i < num.length-1; i++) {
			int min = num[i];
			int min_index = i;
			for(int j = i+1; j < num.length; j++) {
				if(min > num[j]) {
					min = num[j];
					min_index = j;
				}
			}
			int temp = num[i];
			num[i] = min;
			num[min_index] = temp;
		}
		System.out.println(Arrays.toString(num));
		
	}

}
