package model;

public class EISgroup {
	public static int method01(int a, int b) {
		if (a == 0) return b;
		if (b == 0) return a;
		if (a == 0 && b == 0) return 0;

		int result = 0;
		for (int i = 0; i < a; i++) result = increment(result);
		for (int i = 0; i < b; i++) result = increment(result);
		
		return result;
	}
	
	
	public static int increment (int n) {
		return (++n);
	}
	
	///////////////////////////////////////////////////////
	public static void method02() {
		String a = new String("abc");
		String b = new String("abc");
		System.out.println("a + b (new String) = " + (a == b));

		String a1 = "abc";
		String b1 = "abc";
		System.out.println("a1 + b1 (w/o new String) = " + (a1 == b1));
		
		System.out.println("a1 - " + a1.getClass());
		System.out.println("b1 - " + b1.getClass());
	}
}
