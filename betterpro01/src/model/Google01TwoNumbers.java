package model;

import java.util.ArrayList;
import java.util.List;

public class Google01TwoNumbers {
	/*
	 * Google 01
	 * 
	 * Given a list of numbers and a number k, return whether any two numbers from
	 * the list add up to k.
	 * 
	 * For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is
	 * 17.
	 * 
	 * Bonus: Can you do this in one pass?
	 */

	public static List<Integer> findNumbers(List<Integer> list, int sum_to_find) {
		List<Integer> result = new ArrayList<Integer>();
		List<Integer> reminder = new ArrayList<Integer>();

		int j = 0;
		int k = 0;
		
		outerloop:
		for (Integer element : list) {
			reminder.add(sum_to_find - element);

			k = 0;
			for (Integer element2 : reminder) {
				if (element2 == element) {
					break outerloop;
				}
				k++;
			}
			j++;
		}
		result.add(k+1);
		result.add(j+1);
		
		return result;
	}

}
