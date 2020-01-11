package unit04面对对象_下;

public class Example4_5_2_21 {

	public static void main(String[] args) {
		try {
			int result = divide(4, 0);
		} catch (Exception e) {
			System.out.println("The exception information captured: " + e.getMessage());
		}
		
		System.out.println("The program continues...");
	}

	private static int divide(int i, int j) {
		int result = i / j;
		return result;
	}
}