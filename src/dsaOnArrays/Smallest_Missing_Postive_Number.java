package dsaOnArrays;

import java.util.Arrays;

public class Smallest_Missing_Postive_Number {

	public static void main(String[] args) {
		int[] arr = { 2, -3, 4, 1, 1, 7 };

		int missing = findMissing(arr);
		System.out.println("Missing number " + missing);
	}

	private static int findMissing(int[] arr) {

		Arrays.sort(arr);

		int res = 1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == res) {
				res++;
			}  else if (arr[i] > res) {
                break;
			}
		}

		return res;

	}

}
