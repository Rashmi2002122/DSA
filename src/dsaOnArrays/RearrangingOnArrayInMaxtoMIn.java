package dsaOnArrays;

import java.util.Arrays;

public class RearrangingOnArrayInMaxtoMIn {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };

		rearranging(arr);
	}

	private static void rearranging(int[] arr) {

		int n = arr.length;
		int maxIdx = n - 1, minIdx = 0;

		// Store maximum element of array
		long M = arr[n - 1] + 1;

		// Traverse array elements
		for (int i = 0; i < n; i++) {
			// At even index : we have to put maximum
			// element
			if (i % 2 == 0) {
				arr[i] += (arr[maxIdx] % M) * M;
				maxIdx--;
			}
			// At odd index : we have to put minimum element
			else {
				arr[i] += (arr[minIdx] % M) * M;
				minIdx++;
			}
		}

		// Reduce array elements to store the new value
		for (int i = 0; i < n; i++) {
			arr[i] = (int) (arr[i] / M);
		}

		System.out.println(Arrays.toString(arr));
	}

}
