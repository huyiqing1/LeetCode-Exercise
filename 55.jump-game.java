/*
 * @lc app=leetcode id=55 lang=java
 *
 * [55] Jump Game
 */

// @lc code=start
class Solution {
    public boolean canJump(int[] nums) {
        int max = 0, curr = 0;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i] + i);
            if (i == curr)
                curr = max;
            if (curr >= nums.length - 1)
                return true;
        }
        return false;
    }
}
// @lc code=end
