/*
 * @lc app=leetcode id=338 lang=java
 *
 * [338] Counting Bits
 */

// @lc code=start
class Solution {
    public int[] countBits(int n) {
        int[] res = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            int count = 0;
            int temp = i;
            while (temp > 0) {
                if (temp % 2 == 1)
                    count++;
                temp >>= 1;
            }
            res[i] = count;
        }
        return res;
    }
}
// @lc code=end

