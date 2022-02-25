import java.util.*;
/*
 * @lc app=leetcode id=17 lang=java
 *
 * [17] Letter Combinations of a Phone Number
 */

// @lc code=start
class Solution {
    private List<String> res = new ArrayList<>();
    private String[] strs = { "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0)
            return res;
        helper(digits, "");
        return res;
    }

    private void helper(String digits, String str) {
        if (digits.length() == 0) {
            res.add(str);
            return;
        }
        int digit = Character.getNumericValue(digits.charAt(0)) - 2;
        for (int i = 0; i < strs[digit].length(); i++) {
            helper(digits.substring(1), str + strs[digit].charAt(i));
        }
    }
}
// @lc code=end
