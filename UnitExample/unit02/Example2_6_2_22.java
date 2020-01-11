package unit02;

public class Example2_6_2_22 {
	public static void main(String[] args) {
		int sum1 = add01(1, 2);
		int sum2 = add02(1, 2, 3);
		double sum3 = add03(1.2, 2.3);

		System.out.println("sum1 = " + sum1);
		System.out.println("sum2 = " + sum2);
		System.out.println("sum3 = " + sum3);
	}

	public static int add01(int i, int j) {
		return i + j;
	}

	public static int add02(int i, int j, int k) {
		return i + j + k;
	}

	public static double add03(double d, double e) {
		return d + e;
	}


}
