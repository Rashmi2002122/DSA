package dsaOnArrays;

public class ClosestPalindrome {

	public static void main(String[] args) {
		int n = 7000;

		closestPalindrome(n);

	}

	private static void closestPalindrome(int n) {

		int RPNum = n;
		while (isPalindrome(Integer.toString(RPNum)) == false) {
			RPNum--;
		}

		int SPNum = n + 1;

		while (isPalindrome(Integer.toString(SPNum)) == false) {
			SPNum++;
		}

		if (Math.abs(n - SPNum) < Math.abs(n - RPNum)) {
			System.out.println(SPNum);
		} else {
			System.out.println(RPNum);
		}

	}

	public static boolean isPalindrome(String s) {
		int left = 0;
		int right = s.length() - 1;

		while (left < right) {
			if (s.charAt(left) != s.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

}
