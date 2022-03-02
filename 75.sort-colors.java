/*
 * @lc app=leetcode id=75 lang=java
 *
 * [75] Sort Colors
 */

// @lc code=start
class Solution {
    public void sortColors(int[] nums) {
        int pos = 0;
        while (pos < nums.length - 1) {
            if (nums[pos] > nums[pos + 1]) {
                int temp = nums[pos];
                nums[pos] = nums[pos + 1];
                nums[pos + 1] = temp;
                if (pos > 0)
                    pos--;
            } else {
                pos++;
            }
        }
    }
}
// @lc code=end
