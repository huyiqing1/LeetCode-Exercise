import java.util.*;
/*
 * @lc app=leetcode id=90 lang=java
 *
 * [90] Subsets II
 */

// @lc code=start
class Solution {
    private HashSet<List<Integer>> res = new HashSet<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        helper(new ArrayList<>(), nums, 0);
        return new ArrayList<>(res);
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
