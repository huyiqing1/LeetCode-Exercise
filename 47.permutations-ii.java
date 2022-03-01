import java.util.*;
/*
 * @lc app=leetcode id=47 lang=java
 *
 * [47] Permutations II
 */

// @lc code=start
class Solution {
    private HashSet<List<Integer>> res = new HashSet<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        if (nums.length == 1) {
            res.add(new ArrayList<>(Arrays.asList(nums[0])));
            return new ArrayList<>(res);
        }
        helper(new ArrayList<>(), nums, new boolean[nums.length]);
        return new ArrayList<>(res);
    }

    private void helper(List<Integer> list, int[] nums, boolean[] visited) {
        if (list.size() == nums.length) {
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (visited[i])
                continue;
            list.add(nums[i]);
            visited[i] = true;
            helper(list, nums, visited);
            list.remove(list.size() - 1);
            visited[i] = false;
        }
    }
}
// @lc code=end
