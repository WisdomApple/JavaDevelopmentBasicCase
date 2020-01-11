package unit04面对对象_下;

public class Example4_5_2_24 {

	public static void main(String[] args) {
		try {
			int result = divide(4, 2);
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static int divide(int i, int j) throws Exception {
		int result = i / j;
		return result;
	}
}