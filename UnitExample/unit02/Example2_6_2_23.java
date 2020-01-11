package unit02;

public class Example2_6_2_23 {
	public static void main(String[] args) {
		int sum1 = add(1, 2);
		int sum2 = add(1, 2, 3);
		double sum3 = add(1.2, 2.3);

		System.out.println("sum 1= " + sum1);
		System.out.println("sum2 = " + sum2);
		System.out.println("sum3 = " + sum3);
	}

	public static int add(int i, int j) {
		return i + j;
	}

	public static int add(int i, int j, int k) {
		return i + j + k;
	}

	public static double add(double d, double e) {
		return d + e;
	}
}
