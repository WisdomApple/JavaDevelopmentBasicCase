package unit03面向对象_上.otherClass;

public class Single {
	private static Single INSTANCE = new Single();
	private Single() {}
	public static Single getInstance() {
		return INSTANCE;
	}
}
