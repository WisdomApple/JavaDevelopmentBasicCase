package unit04��Զ���_��;

import unit04��Զ���_��.otherClass.Animal_4_4_1;

public class Example4_4_4_18 {

	public static void main(String[] args) {
		class Cat_4_4_4_18 implements Animal_4_4_1 {
			public void shout() {
				System.out.println("Meow...");
			}
		}
		animalShout(new Cat_4_4_4_18());
	}

	private static void animalShout(Animal_4_4_1 an) {
		an.shout();
	}
}