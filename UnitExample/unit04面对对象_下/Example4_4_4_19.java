package unit04面对对象_下;

import unit04面对对象_下.otherClass.Animal_4_1;

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