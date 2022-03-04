import java.util.*;
/*
 * @lc app=leetcode id=89 lang=java
 *
 * [89] Gray Code
 */

// @lc code=start
class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> res = new ArrayList<>();
        if (n == 1) {
            res = Arrays.asList(0, 1);
            return res;
        }
        List<Integer> prev = grayCode(n - 1);
        for (int i = 0; i < prev.size(); i++) {
            res.add(0 + prev.get(i) * 2);
        }
        for (int i = prev.size() - 1; i >= 0; i--) {
            res.add(1 + prev.get(i) * 2);
        }
        return res;
    }
}
// @lc code=end
