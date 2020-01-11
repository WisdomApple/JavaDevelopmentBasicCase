package unit04��Զ���_��;

import unit04��Զ���_��.otherClass.DivideByMinusException;

public class Example4_5_2_27 {

	public static void main(String[] args) {
		try {
			int result = divide(4, -2);
			System.out.println(result);
		} catch (DivideByMinusException e) {
			System.out.println(e.getMessage());
		}
	}
	
	private static int divide(int i, int j) throws DivideByMinusException {
		if (j < 0) {
			throw new DivideByMinusException("The dividend is negative.");
		}
		
		int result = i / j;
		return result;
	}
}