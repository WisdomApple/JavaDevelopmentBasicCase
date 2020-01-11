package unit04面对对象_下.otherClass;

public class Animal_4_1 {
	public String name1;
	String name2 = "Martin";
	
	public void shout() {
		System.out.println("Animal_4_1 sounds");
	}
	
	public Animal_4_1() {
	}
	public Animal_4_1(String name) {
		System.out.println("It's a " + name);
	}
	
	public String toString() {
		return "It's an animal";
	}
}
