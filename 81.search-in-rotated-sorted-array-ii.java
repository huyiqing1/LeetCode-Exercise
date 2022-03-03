/*
 * @lc app=leetcode id=81 lang=java
 *
 * [81] Search in Rotated Sorted Array II
 */

// @lc code=start
class Solution {
    public boolean search(int[] nums, int target) {
        int rotate = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                rotate = i + 1;
                break;
            }
        }
        boolean left = binarySearch(nums, target, 0, rotate);
        boolean right = binarySearch(nums, target, rotate, nums.length - 1);
        return left || right;
    }

    private boolean binarySearch(int[] nums, int target, int left, int right) {
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target)
                return true;
            if (target > nums[mid])
                left = mid + 1;
            else
                right = mid - 1;
        }
        return false;
    }
}
// @lc code=end
