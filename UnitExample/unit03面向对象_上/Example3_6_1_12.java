package unit03�������_��;

import unit03�������_��.otherClass.Student;

public class Example3_6_1_12 {
	public static void main(String[] args) {
		Student stu1 = new Student();
		Student stu2 = new Student();
		Student.schoolName = "Peking";
		
		System.out.println("I'm studying in " + stu1.schoolName);
		System.out.println("I'm studying in " + stu2.schoolName);
	}
}