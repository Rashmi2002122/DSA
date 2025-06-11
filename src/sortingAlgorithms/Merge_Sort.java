package sortingAlgorithms;

import java.util.Arrays;

public class Merge_Sort {

	public static void main(String[] args) {
		int[] arr = { 38, 27, 43, 10 };

		printArray(arr);
		sort(arr);
		printArray(arr);
	}

	private static void sort(int[] arr) {

		int length = arr.length;
		int middle = length / 2;
		if (length < 2)
			return;

		int[] leftArrays = new int[middle];
		int[] rightArrays = new int[length - middle];

		for (int i = 0; i < middle; i++) {
			leftArrays[i] = arr[i];
		}
		for (int i = middle; i < length; i++) {
			rightArrays[i - middle] = arr[i];
		}

		sort(leftArrays);
		sort(rightArrays);
		merge(leftArrays, rightArrays, arr);

	}

	private static void merge(int[] leftArrays, int[] rightArrays, int[] arr) {

		int leftSize = leftArrays.length;
		int rightSize = rightArrays.length;
		int i = 0, l = 0, r = 0;

		while (l < leftSize && r < rightSize) {
			if (leftArrays[i] < rightArrays[i]) {
				arr[i] = leftArrays[l];
				i++;
				l++;
			} else
				arr[i] = rightArrays[r];
			i++;
			r++;
		}

		while (l < leftSize) {
			arr[i++] = leftArrays[l];
			l++;
		}
		while (r < rightSize) {
			arr[i++] = leftArrays[l];
			r++;
		}
	}

	private static void printArray(int[] arr) {

		System.out.println(Arrays.toString(arr));

	}

}
