package model;

import java.util.LinkedList;
import java.util.List;

public class GetPrimeNumbers {
	public static List<Integer> getPrimeNumbers(int from, int to) {
		/*
		 * Please implement this method to return a list of all prime numbers in the
		 * given range (inclusively). A prime number is a natural number that has
		 * exactly two distinct natural number divisors, which are 1 and the prime
		 * number itself. The first prime numbers are: 2, 3, 5, 7, 11, 13
		 */

		List<Integer> result = new LinkedList<Integer>();
		for (int i = from; i <= to; i++) {

			boolean is_prime = Boolean.TRUE;

			for (int j = 2; j < i; j++) {

				if (i % j == 0) {
					is_prime = Boolean.FALSE;
					break;
				}

			}
			if (is_prime) {
				result.add(i);
			}
		}

		return result;
	}
}
