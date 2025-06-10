package dsaOnArrays;

import java.util.Arrays;

public class Zig_Zag_fashion {

	public static void main(String[] args) {

		int[] num = { 1, 3, 5, 2, 6, 8, 7, 9 };

		zigZagFashion(num);

	}

	private static void zigZagFashion(int[] num) {

		Arrays.sort(num);

		for (int i = 1; i < num.length - 2; i += 2) {

			int temp = num[i];
			num[i] = num[i + 1];
			num[i + 1] = temp;
		}

		System.out.println(Arrays.toString(num));

	}

}
