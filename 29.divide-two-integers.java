/*
 * @lc app=leetcode id=29 lang=java
 *
 * [29] Divide Two Integers
 */

// @lc code=start
class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;

        boolean isNegative = dividend < 0 ^ divisor < 0;
        int res = 0, temp = 0;
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        while (dividend - divisor >= 0) {
            for (temp = 0; dividend - (divisor << temp << 1) >= 0; temp++)
                ;
            res += 1 << temp;
            dividend -= divisor << temp;
        }
        return isNegative ? -res : res;
    }
}
// @lc code=end

