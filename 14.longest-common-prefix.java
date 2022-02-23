/*
 * @lc app=leetcode id=14 lang=java
 *
 * [14] Longest Common Prefix
 */

// @lc code=start
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String common = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(common) != 0) {
                common = common.substring(0, common.length() - 1);
            }
        }
        return common;
    }
}
// @lc code=end

