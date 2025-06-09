package dsaOnArrays;

public class MaximumSum {

	public static void main(String[] args) {
		int arr[] = { 8, 3, 1, 2 };

		maximumSum(arr);
	}

	private static void maximumSum(int[] arr) {
		// TODO Auto-generated method stub

		int res = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = 0; j < arr.length; j++) {
				int index = (i + j) % arr.length;
				sum += j * arr[index];
			}

			res = Math.max(res, sum);
		}

		System.out.println("Maximum value :" + res);
	}

}
