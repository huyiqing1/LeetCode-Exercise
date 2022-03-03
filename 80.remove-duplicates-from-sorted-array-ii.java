import java.util.*;
/*
 * @lc app=leetcode id=80 lang=java
 *
 * [80] Remove Duplicates from Sorted Array II
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        int temp = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == temp && count < 2)
                count++;
            else if (nums[i] == temp && count >= 2) {
                nums[i] = Integer.MAX_VALUE;
                len--;
            } else {
                temp = nums[i];
                count = 1;
            }
        }
        Arrays.sort(nums);
        return len;
    }
}
// @lc code=end
