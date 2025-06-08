package dsaOnArrays;

import java.util.HashSet;

public class SumPairing {

	public static void main(String[] args) {

		int[] arr = { 11, 15, 6, 8, 9, 10 };
		int target = 16;

		boolean checkSumPairing = checkSumPairing(arr, target);
		System.out.println("Output is " + checkSumPairing);
	}

	private static boolean checkSumPairing(int[] arr, int target) {

		HashSet<Integer> hash = new HashSet<Integer>();

		for (int i = 0; i < arr.length; i++) {
			int com = target - arr[i];

			if (hash.contains(com)) {
				return true;
			}

			hash.add(arr[i]);
		}

		return false;

	}

}
