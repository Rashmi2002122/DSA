package sortingAlgorithms;

import java.util.Arrays;

public class Insertion_Sort {

	public static void main(String[] args) {

		int arr[] = { 12, 11, 13, 5, 6 };
		printArray(arr);
		
		sort(arr);

		printArray(arr);

	}

	private static void printArray(int[] arr) {

		System.out.println(Arrays.toString(arr));

	}

	private static void sort(int[] arr) {

		int n = arr.length;
		for (int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}

			arr[j + 1] = key;
		}

	}

}
