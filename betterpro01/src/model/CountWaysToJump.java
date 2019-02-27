package model;

public class CountWaysToJump {
	private static int counter = 0;
	
	public static int fib(int n) {
		if (n <= 1) {
			counter++;
			System.out.println("Counter <= 1    = " + counter + ". n = " + n);
			return n;
		}
		counter++;
		System.out.println("Counter = outer = " + counter + ". n = " + n);

		return fib(n - 1) + fib(n - 2);
	}

	// Returns number of ways to reach s'th stair
	public static int countWaysToJump(int N) {
		/*
		 * A set of stairs has N steps. You can jump either 1 or 2 steps at a time. For
		 * example, if the stairs is N=4 steps, you can reach the end in 5 possible
		 * ways: 1-1-1-1, or 1-2-1 or 1-1-2 or 2-1-1 or 2-2 Please implement this method
		 * to return the count of the different ways to reach the end of the stairs with
		 * N steps.
		 */
		return fib(N + 1);
	}
}
