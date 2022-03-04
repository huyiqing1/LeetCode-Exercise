import java.util.*;
/*
 * @lc app=leetcode id=91 lang=java
 *
 * [91] Decode Ways
 */

// @lc code=start
class Solution {

    private HashMap<String, Integer> map = new HashMap<>();

    public int numDecodings(String s) {
        if (s.charAt(0) == '0')
            return 0;
        if (s.length() == 1)
            return 1;
        return helper(s, 0);
    }

    private int helper(String s, int pos) {
        if (pos < s.length() && s.charAt(pos) == '0')
            return 0;
        if (pos >= s.length() - 1)
            return 1;
        String key = s.substring(pos);
        if (map.containsKey(key))
            return map.get(key);
        int choice1 = helper(s, pos + 1);
        int choice2 = 0;
        int combined = (s.charAt(pos) - 48) * 10 + (s.charAt(pos + 1) - 48);
        if (combined <= 26)
            choice2 = helper(s, pos + 2);
        map.put(key, choice1 + choice2);
        return choice1 + choice2;
    }
}
// @lc code=end
