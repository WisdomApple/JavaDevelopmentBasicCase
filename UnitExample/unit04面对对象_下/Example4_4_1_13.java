package unit04��Զ���_��;

import unit04��Զ���_��.otherClass.*;

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