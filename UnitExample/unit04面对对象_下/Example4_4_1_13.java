package unit04面对对象_下;

import unit04面对对象_下.otherClass.*;

public class Example4_4_1_13 {

	public static void main(String[] args) {
		Animal_4_4_1 an1 = new Cat_4_4();
		Animal_4_4_1 an2 = new Dog_4_3_1();
		animalShout(an1);
		animalShout(an2);
		
	}

	private static void animalShout(Animal_4_4_1 an) {
		an.shout();
	}
}