package unit04��Զ���_��;

public class Example4_5_2_25 {

	public static void main(String[] args) throws Exception {
		int result = divide(4, 0);
		System.out.println(result);
	}
	
	private static int divide(int i, int j) throws Exception {
		int result = i / j;
		return result;
	}
}