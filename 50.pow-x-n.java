/*
 * @lc app=leetcode id=50 lang=java
 *
 * [50] Pow(x, n)
 */

// @lc code=start
class Solution {
    public double myPow(double x, int n) {
        if (n > 0)
            return calculate(x, n);
        else
            return calculate(1 / x, n);
    }

    private double calculate(double x, int n) {
        if (n == 0)
            return 1;
        double res = calculate(x, n / 2);
        res = res * res;
        if (n % 2 == 0)
            return res;
        else
            return res * x;
    }
}
// @lc code=end
