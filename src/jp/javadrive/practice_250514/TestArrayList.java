package jp.javadrive.practice_250514;

import java.util.ArrayList;

public class TestArrayList {
	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("りんご");
		fruits.add("みかん");
		fruits.add("いちご");
		System.out.println("問題1：" + fruits);
		System.out.println("問題2：" + fruits.get(1));
		fruits.add(0, "ぶどう");
		System.out.println("問題3：" + fruits);
		fruits.set(2, "でこぽん");
		System.out.println("問題4：" + fruits);
		if (fruits.contains("りんご")) {
			fruits.remove("りんご");
		}
		System.out.println("問題5：" + fruits);
	}
}