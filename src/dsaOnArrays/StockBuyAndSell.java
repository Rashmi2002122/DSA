package dsaOnArrays;

import java.util.Arrays;

public class StockBuyAndSell {

	public static void main(String[] args) {
		int[] prices = { 7, 10, 1, 3, 6, 9, 2 };

		findMaxGain(prices);
	}

	private static void findMaxGain(int[] prices) {
		int size = prices.length;
		int res = 0;
		for (int i = 0; i < size - 1; i++) {

			for (int j = i + 1; j < size; j++) {
				res = Math.max(res, prices[i] - prices[j]);
			}
		}
		System.out.println(Arrays.toString(prices));
		System.out.println("Output :" + res);

	}

}
