package dsaOnArrays;

import java.util.Arrays;

public class RotateOnArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int d = 2;

		rotateArr(arr, d);
	}

	private static void rotateArr(int[] arr, int d) {

		for (int i = 0; i < d; i++) {
			int first = arr[0];
			for (int j = 0; j < arr.length - 1; j++) {
				arr[j] = arr[j + 1];
			}
			arr[arr.length - 1] = first;
		}

		System.out.println(Arrays.toString(arr));

	}

}
