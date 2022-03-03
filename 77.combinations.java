import java.util.*;
/*
 * @lc app=leetcode id=77 lang=java
 *
 * [77] Combinations
 */

// @lc code=start
class Solution {
    private List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        helper(new ArrayList<>(), n, k);
        return res;
    }

    private void helper(List<Integer> list, int n, int k) {
        if (list.size() == k) {
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = 1; i <= n; i++) {
            list.add(i);
            helper(list, i - 1, k);
            list.remove(list.size() - 1);
        }
    }
}
// @lc code=end
