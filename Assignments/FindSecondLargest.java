package week1.day2.Assignments;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {

		int[] data = {3,2,11,4,6,7};
		Arrays.sort(data);
        for (int i = 5; i <data.length; i++) {
				System.out.println("Last second Largest number is= "+ data[4]);
		}
	}
}