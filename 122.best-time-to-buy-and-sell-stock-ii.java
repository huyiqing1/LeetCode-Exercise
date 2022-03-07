/*
 * @lc app=leetcode id=122 lang=java
 *
 * [122] Best Time to Buy and Sell Stock II
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buy = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (buy > prices[i])
                buy = prices[i];
            else if (buy < prices[i]) {
                if (i < prices.length - 1 && prices[i] < prices[i + 1])
                    continue;
                profit += prices[i] - buy;
                buy = prices[i];
            }
        }
        return profit;
    }
}
// @lc code=end
