package betterpro01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import model.CountWaysToJump;
import model.GetPrimeNumbers;
import model.Google01TwoNumbers;
import model.ReverseArray;
import model.ReverseListInterface;

public class Test101 {

	public static void main(String[] args) {
		/*
		 * 01 Please implement this method to return a new array where the order of
		 * elements has been reversed from the original array.
		 */
//		  Object[] a = new Object[] {1,2,3,5,6,7,8,9,10,4};
//		  System.out.println(Arrays.toString(a));
//		  System.out.println(Arrays.toString(ReverseArray.reverseArray(a)));
		 

		/*
		 * 02 Please implement this method to return a list of all prime numbers in the
		 * given range (inclusively). A prime number is a natural number that has
		 * exactly two distinct natural number divisors, which are 1 and the prime
		 * number itself. The first prime numbers are: 2, 3, 5, 7, 11, 13
		 */
//		
//		  System.out.println(GetPrimeNumbers.getPrimeNumbers(40, 80));
//		 

		/*
		 * 03 Please implement this method to reverse a given linked list.
		 */
//		 ListNode node = ;;
//		 ReverseListInterface.reverse(node);

		/*
		 * 04 A set of stairs has N steps. You can jump either 1 or 2 steps at a time.
		 * For example, if the stairs is N=4 steps, you can reach the end in 5 possible
		 * ways: 1-1-1-1, or 1-2-1 or 1-1-2 or 2-1-1 or 2-2 Please implement this method
		 * to return the count of the different ways to reach the end of the stairs with
		 * N steps.
		 */
		// System.out.println(CountWaysToJump.countWaysToJump(3));

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
		List<Integer> list = Arrays.asList(10, 15, 3, 6, 8, 10, 45, 7, 4);
		int sum_to_find = 17;
		System.out.println("Source array  = " + list);
		System.out.println("To get [" + sum_to_find + "] you need these elements (solution 01): " + Google01TwoNumbers.findNumbers01(list, sum_to_find));
		System.out.println("To get [" + sum_to_find + "] you need these elements (solution 02): " + Arrays.toString(Google01TwoNumbers.findNumbers02(list, sum_to_find)));
	}
}