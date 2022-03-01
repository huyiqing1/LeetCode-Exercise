import java.util.*;
/*
 * @lc app=leetcode id=46 lang=java
 *
 * [46] Permutations
 */

// @lc code=start
class Solution {
    private List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        if (nums.length == 1) {
            res.add(Arrays.asList(nums[0]));
            return res;
        }
        helper(new ArrayList<>(), nums);
        return res;
    }

    private void helper(List<Integer> list, int[] nums) {
        if (list.size() == nums.length) {
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (list.contains(nums[i]))
                continue;
            list.add(nums[i]);
            helper(list, nums);
            list.remove(list.size() - 1);
        }
    }
}
// @lc code=end
