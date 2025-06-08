package dsaOnArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingElements {

	public static void main(String[] args) {
		int[] num = { 1, 2, 4, 6, 7, 9 };

		findMissingElement(num);
	}

	private static void findMissingElement(int[] num) {

		List<Integer> num2 = new ArrayList<Integer>();

		for (int i = 0; i < num.length-1; i++) {

			int current = num[i];
			int next = num[i + 1];

			for (int j = current + 1; j < next; j++) {
				num2.add(j);
			}

		}

		System.out.println(Arrays.toString(num));
		num2.forEach(System.out::println);

	}

}
