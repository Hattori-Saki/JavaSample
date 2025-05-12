package jp.javadrive.practice_250512;

public class CountEvenToTen {
	public static void main(String[] args) {
		for (int count = 1; count <= 10; count++) {
			if (count % 2 == 0) {
				System.out.println(count);
			}
		}
	}
}