package dsaOnArrays;

public class MajorityElement {
	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 1, 3, 5, 1 };
		int majorityElement = majorityElement(arr);
		System.out.println("majority element is " + majorityElement);

	}

	private static int majorityElement(int[] arr) {
		// TODO Auto-generated method stub
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count > max) {
				max = arr[i];
			}
		}

		return max;
	}
}
