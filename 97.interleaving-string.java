/*
 * @lc app=leetcode id=97 lang=java
 *
 * [97] Interleaving String
 */

// @lc code=start
class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length())
            return false;
        if (s1.length() == 0 && s2.length() == 0 && s3.length() == 0)
            return true;
        return helper(s1, s2, s3, 0, 0, new Boolean[s1.length() + 1][s2.length() + 1]);
    }

    private boolean helper(String s1, String s2, String s3, int pos1, int pos2, Boolean[][] dp) {
        if (pos1 == s1.length() && pos2 == s2.length())
            return true;
        if (dp[pos1][pos2] != null)
            return dp[pos1][pos2];
        if (pos1 < s1.length() && s1.charAt(pos1) == s3.charAt(pos1 + pos2)) {
            boolean res = helper(s1, s2, s3, pos1 + 1, pos2, dp);
            if (res) {
                dp[pos1 + 1][pos2] = res;
                return true;
            }
        }
        if (pos2 < s2.length() && s2.charAt(pos2) == s3.charAt(pos1 + pos2)) {
            boolean res = helper(s1, s2, s3, pos1, pos2 + 1, dp);
            if (res) {
                dp[pos1][pos2 + 1] = res;
                return true;
            }
        }
        dp[pos1][pos2] = false;
        return false;
    }
}
// @lc code=end
