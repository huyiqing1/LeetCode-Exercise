/*
 * @lc app=leetcode id=139 lang=java
 *
 * [139] Word Break
 */

// @lc code=start
class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int[] dp = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j <= i; j++) {
                String str = s.substring(j, i + 1);
                if (wordDict.contains(str))
                    dp[i] += j > 0 ? dp[j - 1] : 1;
            }
        }
        return dp[s.length() - 1] > 0;
    }
}
// @lc code=end
