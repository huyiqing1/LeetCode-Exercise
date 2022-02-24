/*
 * @lc app=leetcode id=6 lang=java
 *
 * [6] Zigzag Conversion
 */

// @lc code=start
class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1)
            return s;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            int k = (numRows - 1) * 2;
            for (int j = i; j < s.length(); j += k) {
                sb.append(s.charAt(j));
                if (i > 0 && i < numRows - 1 && (j + k - 2 * i) < s.length())
                    sb.append(s.charAt(j + k - 2 * i));
            }
        }
        return sb.toString();
    }
}
// @lc code=end
