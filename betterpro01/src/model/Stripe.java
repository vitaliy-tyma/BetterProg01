package model;

import java.util.Arrays;

public class Stripe {
	/**
	 * Stripe 01
	 * 
	 * Given an array of integers, find the first missing positive integer in linear
	 * time and constant space. In other words, find the lowest positive integer
	 * that does not exist in the array. The array can contain duplicates and
	 * negative numbers as well.
	 * 
	 * For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0]
	 * should give 3.
	 * 
	 * You can modify the input array in-place.
	 */
	public static String method01(int[] stripeArray) {

		if (stripeArray.length == 0) {
			return " array is empty.";
		}

		Arrays.sort(stripeArray);

		int i = 0;
		for (i = 0; i < stripeArray.length; i++) {
			
			/** Pass all negative values and 0. resInt++ */
			if (stripeArray[i] <= 0) {
				continue;
			}


			if ((i + 1) < stripeArray.length) {
				/** Inside of array - check if a[i]+1 <> a[i+1] - gap found - exit */
				if (stripeArray[i] + 1 != stripeArray[i + 1]) {
					break;
				}
			} else {
				/** End of array has been reached - result = a[i]+1 - exit */
				break;
			}
		}
		return Integer.toString(stripeArray[i] + 1);
	}
}
