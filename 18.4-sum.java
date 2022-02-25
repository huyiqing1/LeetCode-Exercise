import java.util.*;
/*
 * @lc app=leetcode id=18 lang=java
 *
 * [18] 4Sum
 */

// @lc code=start
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        HashSet<List<Integer>> res = new HashSet<>();
        if (nums.length < 4)
            return new ArrayList<>();
        Arrays.sort(nums);
        for (int a = 0; a < nums.length - 3; a++) {
            int d = nums.length - 1;
            while (d >= 0 && d > a) {
                int b = a + 1;
                int c = d - 1;
                while (b < c) {
                    int sum = nums[a] + nums[b] + nums[c] + nums[d];
                    if (sum == target) {
                        res.add(Arrays.asList(nums[a], nums[b], nums[c], nums[d]));
                        b++;
                        c--;
                    } else if (sum > target)
                        c--;
                    else
                        b++;
                }
                d--;
            }
        }
        return new ArrayList<>(res);
    }
}
// @lc code=end

