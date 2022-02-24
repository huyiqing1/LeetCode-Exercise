/*
 * @lc app=leetcode id=8 lang=java
 *
 * [8] String to Integer (atoi)
 */

// @lc code=start
class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if (s.length() == 0)
            return 0;
        long res = 0;
        boolean negative = false;
        if (s.charAt(0) == '-') {
            negative = true;
            s = s.substring(1);
        } else if (s.charAt(0) == '+') {
            s = s.substring(1);
        }
        while (s.length() > 0 && isDigit(s.charAt(0)) && res <= Integer.MAX_VALUE && res >= Integer.MIN_VALUE) {
            res = res * 10 + s.charAt(0) - 48;
            s = s.substring(1);
        }
        if (negative)
            res *= -1;
        res = res >= Integer.MAX_VALUE ? Integer.MAX_VALUE : res;
        res = res <= Integer.MIN_VALUE ? Integer.MIN_VALUE : res;
        return (int) res;
    }

    private boolean isDigit(char c) {
        return c >= '0' && c <= '9';
    }
}
// @lc code=end
