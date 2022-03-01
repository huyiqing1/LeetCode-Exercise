import java.util.*;
/*
 * @lc app=leetcode id=40 lang=java
 *
 * [40] Combination Sum II
 */

// @lc code=start
class Solution {
    private List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        helper(new ArrayList<>(), candidates, 0, target);
        return res;
    }

    private void helper(List<Integer> list, int[] candidates, int start, int remain) {
        if (remain == 0) {
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] > remain)
                return;
            if (i > start && candidates[i] == candidates[i - 1])
                continue;
            list.add(candidates[i]);
            helper(list, candidates, i + 1, remain - candidates[i]);
            list.remove(list.size() - 1);
        }
    }
}
// @lc code=end
