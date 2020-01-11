package unit03面向对象_上;

import unit03面向对象_上.otherClass.Single;

public class Example3_6_4_15 {
	public static void main(String[] args) {
		Single s1 = Single.getInstance();
		Single s2 = Single.getInstance();
		System.out.println(s1 == s2);
	}
}