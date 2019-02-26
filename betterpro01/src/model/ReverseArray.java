package model;

public class ReverseArray {
	public static Object[] reverseArray(Object[] a) {
		/*
		 * Please implement this method to return a new array where the order of
		 * elements has been reversed from the original array.
		 */
		int i = 0;
		int a_length = a.length;
		Object[] b = new Object[a_length];

		for (Object object : a) {
			i++;
			b[a_length - i] = object;
		}
		return b;
	}

}
