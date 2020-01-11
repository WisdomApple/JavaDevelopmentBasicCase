package unit03面向对象_上;

import unit03面向对象_上.otherClass.Person;

public class Example3_3_2_7 {
	public static void main(String[] args) {
		Person p1 = new Person("Jack");
		Person p2 = new Person("Rose", 18);
		p1.speak();
		p2.speak();
	}
}