import java.util.*;
/*
 * @lc app=leetcode id=47 lang=java
 *
 * [47] Permutations II
 */

// @lc code=start
class Solution {
    private List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        if (nums.length == 1) {
            res.add(new ArrayList<>(Arrays.asList(nums[0])));
            return res;
        }
        Arrays.sort(nums);
        helper(new ArrayList<>(), nums, new boolean[nums.length]);
        return res;
    }

    private void helper(List<Integer> list, int[] nums, boolean[] visited) {
        if (list.size() == nums.length) {
            res.add(new ArrayList<>(list));
            return;
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (visited[i])
                continue;
            if (i > 0 && nums[i] == nums[i - 1] && !visited[i - 1])
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
