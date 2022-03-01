import java.util.HashSet;

/*
 * @lc app=leetcode id=36 lang=java
 *
 * [36] Valid Sudoku
 */

// @lc code=start
class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            if (!isValid(board[i]))
                return false;
        }

        for (int i = 0; i < 9; i++) {
            char[] arr = new char[9];
            for (int j = 0; j < 9; j++) {
                arr[j] = board[j][i];
            }
            if (!isValid(arr))
                return false;
        }

        for (int x = 0; x < 9; x += 3) {
            for (int y = 0; y < 9; y += 3) {
                char[] arr = new char[9];
                int index = 0;
                for (int i = x; i < x + 3; i++) {
                    for (int j = y; j < y + 3; j++) {
                        arr[index] = board[i][j];
                        index++;
                    }
                }
                if (!isValid(arr))
                    return false;
            }
        }
        return true;
    }

    private boolean isValid(char... arr) {
        HashSet<Character> set = new HashSet<>();
        for (char c : arr) {
            if (c != '.') {
                if (!set.add(c))
                    return false;
            }
        }
        return true;
    }
}
// @lc code=end
