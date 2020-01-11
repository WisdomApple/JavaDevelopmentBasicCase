package unit03面向对象_上.otherClass;

public class Outer_19 {
	private int num = 4;
	
	public void test() {
		class Inner {
			void show() {
				System.out.println("num = " + num);	
			}
		}
		Inner in = new Inner();
		in.show();
	}
}