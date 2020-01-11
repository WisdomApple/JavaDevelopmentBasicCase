package unit04面对对象_下.otherClass;

public class Dog_4_1 extends Animal_4_1 {
	String name = "Dog_4_1";
	public void printName() {
		System.out.println("the dog's name is " + name1);
		System.out.println("the dog's name is " + super.name2);
	}
	
	public void shout() {
		super.shout();
		System.out.println("Braking...");
	}
	
	public void Dog() {
	}
	public Dog_4_1() {
		super("black dog");
	}
}