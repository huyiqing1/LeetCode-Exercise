/*
 * @lc app=leetcode id=12 lang=java
 *
 * [12] Integer to Roman
 */

// @lc code=start
class Solution {
    public String intToRoman(int num) {
        StringBuilder res = new StringBuilder();
        while (num >= 900) {
            num -= 1000;
            if (num < 0) {
                res.append("CM");
                num += 100;
            } else
                res.append('M');
        }
        while (num >= 400) {
            num -= 500;
            if (num < 0) {
                res.append("CD");
                num += 100;
            } else
                res.append('D');
        }
        while (num >= 90) {
            num -= 100;
            if (num < 0) {
                res.append("XC");
                num += 10;
            } else
                res.append('C');
        }
        while (num >= 40) {
            num -= 50;
            if (num < 0) {
                res.append("XL");
                num += 10;
            } else
                res.append('L');
        }
        while (num >= 9) {
            num -= 10;
            if (num < 0) {
                res.append("IX");
                num += 1;
            } else
                res.append('X');
        }
        while (num >= 4) {
            num -= 5;
            if (num < 0) {
                res.append("IV");
                num += 1;
            } else
                res.append('V');
        }
        while (num > 0) {
            num -= 1;
            res.append('I');
        }
        return res.toString();
    }
}
// @lc code=end
