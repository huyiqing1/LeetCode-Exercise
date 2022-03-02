/*
 * @lc app=leetcode id=59 lang=java
 *
 * [59] Spiral Matrix II
 */

// @lc code=start
class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int pos = 1;
        int top = 0, left = 0, right = n - 1, bot = n - 1;
        while (pos <= n * n) {
            for (int i = left; i <= right; i++)
                matrix[top][i] = pos++;
            top++;
            for (int i = top; i <= bot; i++)
                matrix[i][right] = pos++;
            right--;
            for (int i = right; i >= left; i--)
                matrix[bot][i] = pos++;
            bot--;
            for (int i = bot; i >= top; i--)
                matrix[i][left] = pos++;
            left++;
        }
        return matrix;
    }
}
// @lc code=end

