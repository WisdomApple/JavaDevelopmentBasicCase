package unit04��Զ���_��;

import unit04��Զ���_��.otherClass.*;

public class Example4_4_2_14 {

	public static void main(String[] args) {
		Cat_4_4 cat = new Cat_4_4();
		animalShout(cat);
		
	}

	private static void animalShout(Animal_4_4_1 animal) {
		Cat_4_4 cat = (Cat_4_4)animal;
		cat.shout();
		cat.sleep();
	}
}