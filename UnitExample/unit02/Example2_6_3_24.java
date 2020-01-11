package unit02;

public class Example2_6_3_24 {
	public static void main(String[] args) {
		int sum = getSum(4);

		System.out.println("sum = " + sum);
	}

	public static int getSum(int i) {
		if (i == 1)
			return 1;
		int temp = getSum(i - 1);

		return temp + i;
	}

}
