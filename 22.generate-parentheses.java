import java.util.*;
/*
 * @lc app=leetcode id=22 lang=java
 *
 * [22] Generate Parentheses
 */

// @lc code=start
class Solution {
    private List<String> res = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        return helper(n, 1, 0, new StringBuilder("("));
    }

    private List<String> helper(int n, int open, int close, StringBuilder sb) {
        if (open == n && close == n)
            res.add(sb.toString());
        if (open < n) {
            sb.append("(");
            helper(n, open + 1, close, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
        if (open > close && close < n) {
            sb.append(")");
            helper(n, open, close + 1, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
        return res;
    }
}
// @lc code=end
