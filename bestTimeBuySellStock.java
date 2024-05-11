// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/

public class bestTimeBuySellStock {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;   // for empty array
        }
        
        int buyIndex = 0;
        int maxProfit = 0;
        
        for (int sellIndex = 1; sellIndex < prices.length; sellIndex++) {
            if (prices[sellIndex] > prices[buyIndex]) {
                int profit = prices[sellIndex] - prices[buyIndex];    // calculate profit
                maxProfit = Math.max(maxProfit, profit);              // Update maxProfit variable to store the maximum profit seen so far
            } else {
                buyIndex = sellIndex; // Update buyIndex to sellIndex. This effectively represents a new buying point.
            }
        }
        
        return maxProfit;
    }
}

