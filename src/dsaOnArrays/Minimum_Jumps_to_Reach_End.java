package dsaOnArrays;

public class Minimum_Jumps_to_Reach_End {

	public static void main(String[] args) {
		//int arr[] = { 1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9 };
		//int arr[]= {1, 4, 3, 2, 6, 7};
		int arr[]= {0, 10, 20};
		int minimumJump = minimumJump(arr);
		System.out.println("Minimum jump "+minimumJump);

	}

	private static int minimumJump(int[] arr) {

		int count = 0;
		if(arr[0]==0) {
			return -1;
		}
		for (int i = 0; i < arr.length; i++) {
			int jump = arr[i];
			i += jump;
			count++;
		}

		return count;

	}

}
