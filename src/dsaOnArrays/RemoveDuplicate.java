package dsaOnArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicate {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 2, 3, 4, 4, 4, 5, 5 };

		removeDuplicate(arr);

	}

	private static void removeDuplicate(int[] arr) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length -1; i++) {
			if (arr[i] != arr[i + 1]) {
				list.add(arr[i]);
			}
		}
		list.add(arr[arr.length - 1]);
		System.out.println(Arrays.toString(arr));
		for (Integer integer : list) {
			System.out.print(integer);
		}

	}
}
