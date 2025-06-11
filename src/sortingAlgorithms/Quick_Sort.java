package sortingAlgorithms;

import java.util.Arrays;

public class Quick_Sort {

	public static void main(String[] args) {
		int[] arr = { 10, 7, 8, 9, 1, 5 };

		printArray(arr);
		sort(arr, 0, arr.length - 1);
		printArray(arr);
	}

	private static void sort(int[] arr, int start, int end) {

		if (start >= end) return;
			

		int pivot = partison(arr, start, end);

		sort(arr, start, pivot - 1);
		sort(arr, pivot + 1, end);

	}

	private static int partison(int[] arr, int start, int end) {
		int pivot = arr[end];
		int i = start - 1;

		for (int j = start; j < end; j++) {
			if (arr[j] < pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		i++;

		int temp = arr[i];
		arr[i] = arr[end];
		arr[end] = temp;

		return i;
	}

	private static void printArray(int[] arr) {

		System.out.println(Arrays.toString(arr));

	}

}
