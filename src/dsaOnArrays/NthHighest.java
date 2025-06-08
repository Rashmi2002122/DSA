package dsaOnArrays;

import java.util.Arrays;

public class NthHighest {

	public static void main(String[] args) {
		int[] arr = { 1, 14, 2, 16, 10, 20 };
		int n = 3;

		findNthHighest(arr, n);

	}

	private static void findNthHighest(int[] arr, int n) {

		Arrays.sort(arr);
		int nth = arr.length - n;

		System.out.println(n + " maximum number " + arr[nth]);

	}

}
