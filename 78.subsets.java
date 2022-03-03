import java.util.*;
/*
 * @lc app=leetcode id=78 lang=java
 *
 * [78] Subsets
 */

// @lc code=start
class Solution {
    private List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        helper(new ArrayList<>(), nums, 0);
        return res;
    }

    private void helper(List<Integer> list, int[] nums, int pos) {
        if (pos == nums.length) {
            res.add(new ArrayList<>(list));
            return;
        }
        helper(list, nums, pos + 1);
        list.add(nums[pos]);
        helper(list, nums, pos + 1);
        list.remove(list.size() - 1);
    }
}
// @lc code=end
