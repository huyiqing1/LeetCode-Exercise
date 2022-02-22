/*
 * @lc app=leetcode id=13 lang=java
 *
 * [13] Roman to Integer
 */

// @lc code=start
class Solution {
    public int romanToInt(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            int temp = getNum(s.charAt(i));
            if (i != s.length() - 1 && temp < getNum(s.charAt(i + 1))) {
                res += getNum(s.charAt(i + 1)) - temp;
                i++;
            } else {
                res += temp;
            }
        }
        return res;
    }

    private int getNum(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
// @lc code=end
