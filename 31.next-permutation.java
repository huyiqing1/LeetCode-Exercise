/*
 * @lc app=leetcode id=31 lang=java
 *
 * [31] Next Permutation
 */

// @lc code=start
class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while (i >= 0 && nums[i + 1] <= nums[i])
            i--;
        if (i >= 0) {
            int j = nums.length - 1;
            while (j >= 0 && nums[j] <= nums[i])
                j--;
            swap(nums, i, j);
        }
        reverse(nums, i + 1);
    }

    private void swap(int[] nums, int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }

    private void reverse(int[] nums, int pos) {
        int i = pos, j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }
}
// @lc code=end

