package BestTimetoBuyandSellStockII122;

/**
 * Created by Think on 8/17/17.
 */
public class Solution {
    public int maxProfit(int[] prices) {
        int sum = 0;
        if (prices.length == 0 || prices.length == 1) {
            return sum;
        }
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] < prices[i+1]) {
                sum += prices[i+1] - prices[i];
            }
        }
        return sum;
    }
}
