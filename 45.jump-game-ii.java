/*
 * @lc app=leetcode id=45 lang=java
 *
 * [45] Jump Game II
 */

// @lc code=start
class Solution {
    public int jump(int[] nums) {
        int count = 0, curr = 0, max = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            max = Math.max(max, nums[i] + i);
            if (i == curr) {
                count++;
                curr = max;
                if (curr >= nums.length - 1)
                    break;
            }
        }
        return count;
    }
}
// @lc code=end
