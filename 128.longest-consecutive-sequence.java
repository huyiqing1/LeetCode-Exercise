import java.util.*;
/*
 * @lc app=leetcode id=128 lang=java
 *
 * [128] Longest Consecutive Sequence
 */

// @lc code=start
class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0)
            return 0;
        if (nums.length == 1)
            return 1;
        Arrays.sort(nums);
        int num = nums[0];
        int count = 1;
        int max = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == num)
                continue;
            else if (nums[i] == ++num) {
                count++;
            } else {
                num = nums[i];
                max = Math.max(max, count);
                count = 1;
            }
            max = Math.max(max, count);
        }
        return max;
    }
}
// @lc code=end
