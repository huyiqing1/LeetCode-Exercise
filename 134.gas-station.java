/*
 * @lc app=leetcode id=134 lang=java
 *
 * [134] Gas Station
 */

// @lc code=start
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int curr = 0, start = 0, total = 0;
        for (int i = 0; i < cost.length; i++) {
            int diff = gas[i] - cost[i];
            curr += diff;
            if (curr < 0) {
                curr = 0;
                start = i + 1;
            }
            total += diff;
        }
        if (total >= 0)
            return start;
        return -1;
    }
}
// @lc code=end
