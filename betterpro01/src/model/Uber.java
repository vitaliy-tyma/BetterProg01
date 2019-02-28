package model;

import java.util.List;

/**
 * Uber 01.
 * 
 * Given an array of integers, return a new array such that each element at
 * index i of the new array is the product of all the numbers in the original
 * array except the one at i. For example, if our input was [1, 2, 3, 4, 5], the
 * expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1],
 * the expected output would be [2, 3, 6]. Follow-up: what if you can't use
 * division?
 */
public class Uber {
	public static int[] method01(int[] a) {
		int[] b = new int[a.length];
		int j = 0;
		int product = 1;
		
		for (int i = 0; i < a.length; i++) {
			j = 0;
			for (int element : a) {
				if (i == j) {
					element = 1;
				}
				product *= element;
				j++;
			}
			b[i] = product;
			product = 1;
		}

		return b;
	}
}
