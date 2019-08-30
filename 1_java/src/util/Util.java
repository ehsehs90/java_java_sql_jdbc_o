package util;

public class Util {
	public static int[] sort(int[] array) {
		int[] clone = array.clone();
		for(int i = 0; i < clone.length-1; i++) {
			int min_index = i;
			for(int j = i+1; j < clone.length; j++) {
				if(clone[min_index] > clone[j]) {
					min_index = j;
				}
			}
			int temp = clone[i];
			clone[i] = clone[min_index];
			clone[min_index] = temp;
		}
		return clone;
	}
}
