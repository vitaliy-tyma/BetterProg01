package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Airbnb {
	/**
	 * Airbnb 01
	 * 
	 * Given a list of integers, write a function that returns the largest sum of
	 * non-adjacent numbers. Numbers can be 0 or negative.
	 * 
	 * For example, [2, 4, 6, 2, 5] should return 13, since we pick 2, 6, and 5. [5,
	 * 1, 1, 5] should return 10, since we pick 5 and 5.
	 * 
	 * Follow-up: Can you do this in O(N) time and constant space?
	 */
	private static Logger logger = Logger.getLogger(Airbnb.class.getName());

	public static int methodSum01(int[] a1) {
		long startTime = System.nanoTime();
		// logger.entering(Airbnb.class.getName(), "Start 0");
		// logger.log(Level.INFO, "Start");

		/** Convert input Array to ArrayList */
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		LinkedList<Integer> listOfIndexes = new LinkedList();

		// Integer max = (Integer) Collections.max(l1);
		// Collections.addAll(l1, a1);
		for (int i = 0; i < a1.length; i++)
			l1.add(new Integer(a1[i]));

		/////// for (Object v : l1) {
		int maxValue = 0;
		int maxIdx = findMaxIndex(l1, maxValue);
		System.out.println("Max = " + l1.get(maxIdx));
		listOfIndexes.add(maxIdx);
		removeArrayNeibourgs(l1, maxIdx);
		printArray(l1);

		
		maxIdx = findMaxIndex(l1, maxValue);
		listOfIndexes.add(maxIdx);
		System.out.println("Max = " + l1.get(maxIdx));
		removeArrayNeibourgs(l1, maxIdx);
		printArray(l1);
		
//		System.out.println("index1 = " + maxIdx);
//		System.out.println("index2 = " + maxValue);
//		System.out.println("index3 = " + l1.get(maxIdx));
		//////// }

		// logger.exiting(Airbnb.class.getName(), "Stop 0");
		long elapsedTime = System.nanoTime() - startTime;
		// System.out.println("Elapsed " + elapsedTime / 1000 + " ms.");
		logger.log(Level.INFO, "Elapsed " + elapsedTime / 1000 + " ms.");
		return 0;
	}

	private static int findMaxIndex(ArrayList<Integer> list, int value) {
		Integer max;

		// initialize the current maximum
		max = (Integer) list.get(0);

		// scan the array
		for (Integer v : list) {
			if (v > max) { // examine the current element
				max = v; // if it is the largest so far, change max
				value = v;
			}
		}

		return list.indexOf(max);
	}

	/** Print array of objects */
	private static void printArray(ArrayList<Integer> l) {
		System.out.print("Array is: [");
		for (int i = 0; i < l.size(); i++) {
			Object obj = l.get(i);
			System.out.print(obj);
			if (i < l.size() - 1)
				System.out.print(", ");
		}
		System.out.println("]");
	}

	/** Remove 3 elements of array */
	private static void removeArrayNeibourgs(ArrayList<Integer> l, int idx) {
		if (idx + 1 < l.size())
			l.remove(idx + 1);
		
		l.remove(idx);
		
		if (idx - 1 > 0)
			l.remove(idx - 1);
	}
}
