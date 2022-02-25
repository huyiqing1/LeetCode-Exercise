import java.util.Arrays;

/*
 * @lc app=leetcode id=16 lang=java
 *
 * [16] 3Sum Closest
 */

// @lc code=start
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1, k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                int n1 = Math.abs(res - target);
                int n2 = Math.abs(sum - target);
                if (n1 > n2)
                    res = sum;
                if (sum > target)
                    k--;
                else
                    j++;
            }
        }
        return res;
    }
}
// @lc code=end

