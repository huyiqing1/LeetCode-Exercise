/*
 * @lc app=leetcode id=74 lang=java
 *
 * [74] Search a 2D Matrix
 */

// @lc code=start
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        if (target < matrix[0][0])
            return false;
        int height = 0;
        while (matrix[height][n - 1] < target) {
            height++;
            if (height >= m)
                return false;
        }
        int left = 0, right = n;
        while (left <= right) {
            int mid = (left + right) / 2;
            int temp = matrix[height][mid];
            if (temp == target)
                return true;
            if (temp > target)
                right = mid - 1;
            else
                left = mid + 1;
        }
        return false;
    }
}
// @lc code=end
