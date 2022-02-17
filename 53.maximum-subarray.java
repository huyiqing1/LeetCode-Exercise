/*
 * @lc app=leetcode id=53 lang=java
 *
 * [53] Maximum Subarray
 */

// @lc code=start
class Solution {
    public int maxSubArray(int[] nums) {
        int temp = nums[0];
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (temp >= 0) {
                temp += nums[i];
            } else {
                temp = nums[i];
            }
            res = Math.max(res, temp);
        }
        return res;
    }
}
// @lc code=end
