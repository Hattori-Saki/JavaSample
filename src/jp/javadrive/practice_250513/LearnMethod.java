package jp.javadrive.practice_250513;

public class LearnMethod {
	public static void main(String[] args) {
		sum(3,5);
		calculateCircleArea(4);
		checkEvenOdd(13);
		repeat("abc", 6);
	}
	public static int sum(int a, int b) {
		int result = a + b;
		return result;
	}
	public static int calculateCircleArea(int r) {
		int result = r * r;
		return result;
	}
	public static String checkEvenOdd(int x) {
		if (x % 2 == 0) {
			return "even";
 		}
		else {
			return "odd";
		}
	}
	public static void repeat(String m, int n) {
		System.out.println(m.repeat(n));
		
	}
}