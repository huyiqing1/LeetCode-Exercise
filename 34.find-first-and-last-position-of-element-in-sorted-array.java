/*
 * @lc app=leetcode id=34 lang=java
 *
 * [34] Find First and Last Position of Element in Sorted Array
 */

// @lc code=start
class Solution {
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0)
            return new int[] { -1, -1 };
        int[] res = new int[2];
        res[0] = findFirst(nums, target);
        res[1] = findLast(nums, target);
        return res;
    }

    private int findFirst(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int res = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                res = mid;
                right = mid - 1;
            } else if (nums[mid] > target)
                right = mid - 1;
            else
                left = mid + 1;
        }
        return res;
    }

    private int findLast(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int res = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                res = mid;
                left = mid + 1;
            } else if (nums[mid] > target)
                right = mid - 1;
            else
                left = mid + 1;
        }
        return res;
    }
}
// @lc code=end

