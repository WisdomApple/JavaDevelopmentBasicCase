package unit03面向对象_上;

import unit03面向对象_上.otherClass.Student;

public class Example3_2_4_4 {
	public static void main(String[] args) {
		Student stu = new Student();
		stu.setAge(-30);
		stu.setName("Jack");
		stu.introduce();
	}
}