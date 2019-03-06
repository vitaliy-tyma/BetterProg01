package model;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

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
	public static int methodMissingInteger01(int[] stripeArray) {
		long startTime = System.nanoTime();
		long startTimeMs = System.currentTimeMillis();

		Arrays.sort(stripeArray);
		//System.out.println(Arrays.toString(stripeArray));
		
		int i = 0;
		int len = stripeArray.length;
		int resInt = 1;
		
		for (i = 0; i < len; i++) {

			/** Pass all negative values and 0. resInt++ */
			if (stripeArray[i] <= 0) {
				//System.out.println("*** Pass negative and zero *** i = "+ i);
				continue;
			}
			
			if (stripeArray[0] > 1) {
				break;
			}

			if ((i + 1) < len) {
				/** Inside of array - check if a[i]+1 <> a[i+1] - gap found - exit */
				if ((stripeArray[i] + 1 != stripeArray[i + 1]) && (stripeArray[i] != stripeArray[i+1])) {
					resInt = stripeArray[i] + 1;
					//System.out.println("i = " + i + " . stripeArray[i] + 1 = (" + (stripeArray[i] + 1) + ") != (" + stripeArray[i + 1] + ") = stripeArray[i + 1].");
					break;
				}
			} else {
				/** End of array has been reached - result = a[i]+1 - exit */
				break;
			}

		}
		long elapsedTime = System.nanoTime() - startTime;
		long elapsedTimeMs = System.currentTimeMillis() - startTimeMs;

		System.out.println("Elapsed (ns) " + elapsedTime / 1000 + " ms.");
		System.out.println("Elapsed (ms) " + elapsedTimeMs + " ms.");
		
		return resInt;
	}

	
	
	
	public static int methodMissingInteger02(int[] stripeArray) {
		long startTime = System.nanoTime();
		long startTimeMs = System.currentTimeMillis();
		
		Arrays.sort(stripeArray);

		int i = 0;
		int resInt = 1;
		
		for (i = 0; i < stripeArray.length; i++) {

			/** Pass all negative values and 0. resInt++ */
			if (stripeArray[i] <= 1) {
				//System.out.println("*** Pass negative and zero *** i = "+ i);
				continue;
			}
			if (stripeArray[0] > 1) {
				break;
			}
			
			/** Check previous element */
			if ((stripeArray[i] - 1 != stripeArray[i - 1]) && (stripeArray[i] != stripeArray[i-1])) {
				resInt = stripeArray[i - 1] + 1;
				//System.out.println("i = " + i + " . stripeArray[i] + 1 = (" + (stripeArray[i] + 1) + ") != (" + stripeArray[i + 1] + ") = stripeArray[i + 1].");
				break;
			}
		}
		long elapsedTime = System.nanoTime() - startTime;
		long elapsedTimeMs = System.currentTimeMillis() - startTimeMs;

		System.out.println("Elapsed (ns) " + elapsedTime / 1000 + " ms.");
		System.out.println("Elapsed (ms) " + elapsedTimeMs + " ms.");

		return resInt;
	}

}
