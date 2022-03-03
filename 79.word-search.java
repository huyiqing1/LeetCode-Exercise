/*
 * @lc app=leetcode id=79 lang=java
 *
 * [79] Word Search
 */

// @lc code=start
class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        char[] letters = word.toCharArray();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == letters[0]) {
                    boolean b = findNextChar(board, letters, 0, i, j);
                    if (b)
                        return true;
                }
            }
        }
        return false;
    }

    private boolean findNextChar(char[][] board, char[] letters, int pos, int x, int y) {
        if (pos == letters.length)
            return true;
        if (x < 0 || y < 0 || x >= board.length || y >= board[0].length || board[x][y] != letters[pos])
            return false;
        char temp = board[x][y];
        board[x][y] = '0';
        boolean left = findNextChar(board, letters, pos + 1, x, y - 1);
        boolean right = findNextChar(board, letters, pos + 1, x, y + 1);
        boolean top = findNextChar(board, letters, pos + 1, x - 1, y);
        boolean bot = findNextChar(board, letters, pos + 1, x + 1, y);
        if (left || right || top || bot)
            return true;
        board[x][y] = temp;
        return false;
    }
}
// @lc code=end
