package unit03面向对象_上.otherClass;

public class Student {
	private String name;
	private int age;
	public static String schoolName;
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	public void setName(String stuName) {
		name = stuName;
	}
	public void setAge(int stuAge) {
		if (stuAge <= 0)
			System.out.println("Age is illegal!!!");
		else
			age = stuAge;
	}
	
	public void introduce() {
		System.out.println("Hello, My name is " + name + ", I'm " + age + " years old");
	}
}
