package unit05多线程;

import unit05多线程.otherClass.MyThread_5_2_1_1;

public class Example5_2_1_1 {

	public static void main(String[] args) {
		MyThread_5_2_1_1 myThread_5_2_1_1 = new MyThread_5_2_1_1();
		myThread_5_2_1_1.run();
		for (int j = 0; j < 10; j++) {
			System.out.println("Mian method is running");
		}
	}
}