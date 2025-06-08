package dsaOnArrays;

import java.util.Arrays;

public class RepeatingNumber {

	public static void main(String[] args) {

		int[] num = { 1, 1, 3, 4, 2, 5, 3, 5, 3 };

		mostRepeatingNumber(num);

	}

	private static void mostRepeatingNumber(int[] num) {

		int max = 0;
		for (int i = 0; i < num.length; i++) {

			int count = 0;
			for (int j = 0; j < num.length; j++) {
				if (num[i] == num[j]) {
					count++;
				}
			}

			if (count > max) {
				max = num[i];
			}

		}

		System.out.println(Arrays.toString(num));
		System.out.println("Most Repeating Number " + max);

	}

}
