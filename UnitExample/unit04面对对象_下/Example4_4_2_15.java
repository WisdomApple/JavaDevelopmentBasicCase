package unit04面对对象_下;

import unit04面对对象_下.otherClass.*;

public class Example4_4_2_15 {

	public static void main(String[] args) {
		Dog_4_3_1 dog = new Dog_4_3_1();
		animalShout(dog);
	}

	private static void animalShout(Animal_4_4_1 animal) {
		if (animal instanceof Cat_4_4) {
			Cat_4_4 cat = (Cat_4_4)animal;
			cat.sleep();
			cat.shout();
		}
		else {
			System.out.println("this animal is not a cat");
		}
	}
}