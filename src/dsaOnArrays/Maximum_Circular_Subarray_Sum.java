package dsaOnArrays;

import java.util.Currency;

public class Maximum_Circular_Subarray_Sum {

	public static void main(String[] args) {
		int arr[] = { 8, -8, 9, -9, 10, -11, 12 };
		int maxCircularSubArray = maxCircularSubArray(arr);
		System.out.println("Max sunarray :" + maxCircularSubArray);
	}

	private static int maxCircularSubArray(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		int res = arr[0];
		for (int i = 0; i < n; i++) {
			int curSum = 0;
			for (int j = 0; j < n; j++) {
				int index = (i + j) % n;
				curSum += arr[index];
				res = Math.max(res, curSum);
			}
		}

		return res;

	}

}
