package unit02;

public class Example2_6_1_21 {
	public static void main(String[] args) {
		int area = getArea(3, 5);
		System.out.println("The area is " + area);
	}

	public static int getArea(int x, int y) {
		int temp = x * y;

		return temp;
	}
}