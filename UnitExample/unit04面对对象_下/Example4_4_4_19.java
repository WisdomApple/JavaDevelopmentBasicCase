package unit04��Զ���_��;

import unit04��Զ���_��.otherClass.Animal_4_1;

public class Example4_4_4_19 {

	public static void main(String[] args) {
		animalShout(new Animal_4_1(){ 
			public void shout() {
				System.out.println("Meow...");
			}
		});
	}

	private static void animalShout(Animal_4_1 an) {
		an.shout();
	}
}