package unit03�������_��;

import unit03�������_��.otherClass.Person;

public class Example3_3_2_7 {
	public static void main(String[] args) {
		Person p1 = new Person("Jack");
		Person p2 = new Person("Rose", 18);
		p1.speak();
		p2.speak();
	}
}