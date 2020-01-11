package unit02;

public class Example2_7_2_33 {
	public static void main(String[] args) {
		int[][] arr = new int[3][];
		arr[0] = new int[]{11, 12};
		arr[1] = new int[]{21, 22, 23};
		arr[2] = new int[]{31, 32, 33, 34};

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			int groupSum = 0;
			for (int j = 0; j < arr[i].length; j++) {
				groupSum = groupSum + arr[i][j];
			}
			sum = sum + groupSum;
			System.out.println("The sales volume of the group with serial number " + (i + 1) + " is: " + groupSum + "(ten thousand yuan)");
		}
		System.out.println("The total of serial is: " + sum + "(ten thousand yuan)");
	}
}