import java.util.*;
/*
 * @lc app=leetcode id=54 lang=java
 *
 * [54] Spiral Matrix
 */

// @lc code=start
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int top = 0, bot = matrix.length - 1, left = 0, right = matrix[0].length - 1;
        while (true) {
            for (int i = left; i <= right; i++)
                res.add(matrix[top][i]);
            if (++top > bot)
                break;
            for (int i = top; i <= bot; i++)
                res.add(matrix[i][right]);
            if (--right < left)
                break;
            for (int i = right; i >= left; i--)
                res.add(matrix[bot][i]);
            if (--bot < top)
                break;
            for (int i = bot; i >= top; i--)
                res.add(matrix[i][left]);
            if (++left >
             right)
                break;
        }
        return res;
    }
}
// @lc code=end
