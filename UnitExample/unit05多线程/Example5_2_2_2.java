package unit05多线程;

import unit05多线程.otherClass.MyThread_5_2_1_2;

public class Example5_2_2_2 {

	public static void main(String[] args) {
		MyThread_5_2_1_2 myThread = new MyThread_5_2_1_2();
		myThread.start();
		for (int j = 0; j < 10; j++) {
			System.out.println("Mian method is running");
		}
	}
	
}