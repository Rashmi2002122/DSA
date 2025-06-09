package dsaOnArrays;

public class MaximumProductSubarray {

	public static void main(String[] args) {
		int arr[] = { -2, 6, -3, -10, 0, 2 };
		MaxProductSubArray(arr);
	}

	private static void MaxProductSubArray(int[] arr) {
		// TODO Auto-generated method stub

		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			int product = 1;
			for (int j = i; j < arr.length; j++) {
				product *= arr[j];

				max = Math.max(max, product);
			}
		}

		System.out.println(max);

	}

}
