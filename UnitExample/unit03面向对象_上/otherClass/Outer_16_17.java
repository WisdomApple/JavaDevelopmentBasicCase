package unit03�������_��.otherClass;


public class Outer_16_17 {
	private int num = 4;
	
	public void test() {
		Inner inner = new Inner();
		inner.show();
	}
	
	public class Inner {
		public void show() {
			System.out.println("num = " + num);
		}
	}
}
