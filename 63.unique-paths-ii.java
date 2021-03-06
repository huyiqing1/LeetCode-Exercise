/*
 * @lc app=leetcode id=63 lang=java
 *
 * [63] Unique Paths II
 */

// @lc code=start
class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0 && obstacleGrid[0][0] == 0) {
                    dp[i][j] = 1;
                    continue;
                }
                if (i == 0 && j > 0 && obstacleGrid[i][j] != 1) {
                    dp[i][j] = dp[i][j - 1];
                    continue;
                }
                if (j == 0 && i > 0 && obstacleGrid[i][j] != 1) {
                    dp[i][j] = dp[i - 1][j];
                    continue;
                }
                if (obstacleGrid[i][j] != 1 && i > 0 && j > 0)
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m - 1][n - 1];
    }
}
// @lc code=end
