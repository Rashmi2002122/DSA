package dsaOnArrays;

public class StockBuyAndSellMultipleTransaction {
	public static void main(String[] args) {
		int[] prices = { 100, 180, 260, 310, 40, 535, 695 };
		int maximumProfit = maximumProfit(prices);
		System.out.println(maximumProfit);
	}

	// Function to find the maximum profit
	static int maxProfitRec(int[] price, int start, int end) {
		int res = 0;

		// Consider every valid pair, find the profit with it
		// and recursively find profits on left and right of it
		for (int i = start; i < end; i++) {
			for (int j = i + 1; j <= end; j++) {
				if (price[j] > price[i]) {
					int curr = (price[j] - price[i]) + maxProfitRec(price, start, i - 1)
							+ maxProfitRec(price, j + 1, end);
					res = Math.max(res, curr);
				}
			}
		}
		return res;
	}

	// Wrapper function
	static int maximumProfit(int[] prices) {
		return maxProfitRec(prices, 0, prices.length - 1);
	}
}
