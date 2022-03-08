/*
 * @lc app=leetcode id=130 lang=java
 *
 * [130] Surrounded Regions
 */

// @lc code=start
class Solution {
    private boolean[][] visited;

    public void solve(char[][] board) {
        int height = board.length;
        int length = board[0].length;
        if (height <= 2 || length <= 2)
            return;
        visited = new boolean[height][length];
        for (int i = 0; i < height; i++) {
            if (board[i][0] == 'O') {
                visited[i][0] = true;
                helper(board, i, 1);
            }
            if (board[i][length - 1] == 'O') {
                visited[i][length - 1] = true;
                helper(board, i, length - 2);
            }
        }
        for (int i = 0; i < length; i++) {
            if (board[0][i] == 'O') {
                visited[0][i] = true;
                helper(board, 1, i);
            }
            if (board[height - 1][i] == 'O') {
                visited[height - 1][i] = true;
                helper(board, height - 2, i);
            }
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                if (visited[i][j])
                    board[i][j] = 'O';
                else
                    board[i][j] = 'X';
            }
        }
    }

    private void helper(char[][] board, int x, int y) {
        if (x > board.length - 1 || x < 0 || y > board[0].length - 1 || y < 0)
            return;
        if (board[x][y] == 'O' && !visited[x][y]) {
            visited[x][y] = true;
            helper(board, x + 1, y);
            helper(board, x - 1, y);
            helper(board, x, y + 1);
            helper(board, x, y - 1);
        }
    }
}
// @lc code=end
