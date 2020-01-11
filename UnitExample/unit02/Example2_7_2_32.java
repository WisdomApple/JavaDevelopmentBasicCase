package unit02;

public class Example2_7_2_32 {
	public static void main(String[] args) {
		int[] arr = {
				9, 8, 3, 5, 2
		};

		System.out.print("   Before bubble sort: ");
		printArray(arr);
		bubbleSort(arr);
		System.out.print("    After bubble sort: ");
		printArray(arr);
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			System.out.print("The array is sorted " + (i + 1) + ": ");
			printArray(arr);
		}
	}
}
