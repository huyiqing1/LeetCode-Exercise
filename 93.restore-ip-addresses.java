import java.util.*;
/*
 * @lc app=leetcode id=93 lang=java
 *
 * [93] Restore IP Addresses
 */

// @lc code=start
class Solution {

    private List<String> res = new ArrayList<>();

    public List<String> restoreIpAddresses(String s) {
        if (s.length() < 4 || s.length() > 12)
            return new ArrayList<>();
        helper(s, 0, new StringBuilder(), 0);
        return res;
    }

    private void helper(String s, int pos, StringBuilder sb, int count) {
        if (pos < 4 && count > 3)
            return;
        if (pos == s.length() && count == 4) {
            sb.setLength(sb.length() - 1);
            res.add(sb.toString());
            return;
        }
        for (int i = pos + 1; i <= s.length(); i++) {
            if (i - pos > 3)
                break;
            String str = s.substring(pos, i);
            if (str.length() > 1 && str.charAt(0) == '0')
                break;
            if (str.length() <= 3 && Integer.valueOf(str) <= 255 && count < 4) {
                int len = sb.length();
                sb.append(str).append('.');
                helper(s, i, sb, count + 1);
                sb.setLength(len);
            }
        }
    }
}
// @lc code=end
