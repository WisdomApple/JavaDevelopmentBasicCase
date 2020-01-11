package unit03面向对象_上.otherClass;

public class Person {
	String name;
	int age;
	static String country;
	
	public Person(String con_name, int con_age) {
		name = con_name;
		age = con_age;
	}
	
	
	public Person(String con_name) {
		name = con_name;
	}
	

	static {
		country = "China";
		System.out.println("True");
	}


	public void finalize() {
			System.out.println("The garbage collection.");;
		}

	public void speak() {
		System.out.println("Hello, My name is " + name + ", I'm " + age + " years old");	
	}


	public static void sayHello() {
		System.out.println("Hello");
	}
	
	
}