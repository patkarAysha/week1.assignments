package week1.day2.Assignments;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		
		int[] arr1 = { 1, 2, 3, 4, 7, 6, 8 };
		Arrays.sort(arr1);
		int length2 = arr1.length;
		System.out.println(length2);
		for (int i = arr1[0]; i < length2; i++) {
			if (arr1[i - 1] != i) {
				System.out.println(i);
				break;
			}
		}
	}
}
