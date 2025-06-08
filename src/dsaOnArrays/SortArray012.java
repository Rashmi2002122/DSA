package dsaOnArrays;

import java.util.Arrays;

public class SortArray012 {

	public static void main(String[] args) {
		int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };

		sortArray(arr);
	}

	private static void sortArray(int[] arr) {

		int c0 = 0;
		int c1 = 0;
		int c2 = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				c0++;
			} else if (arr[i] == 1) {
				c1++;
			} else {
				c2++;
			}
		}
		int index = 0;
		for (int i = 0; i < c0; i++) {
			arr[index++] = 0;
		}
		for (int i = 0; i < c1; i++) {
			arr[index++] = 1;
		}
		for (int i = 0; i < c2; i++) {
			arr[index++] = 2;
		}

		System.out.println(Arrays.toString(arr));

	}

}
