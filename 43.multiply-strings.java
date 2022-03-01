/*
 * @lc app=leetcode id=43 lang=java
 *
 * [43] Multiply Strings
 */

// @lc code=start
class Solution {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0"))
            return "0";
        StringBuilder sb = new StringBuilder();
        int n1 = num1.length();
        int n2 = num2.length();
        int[] res = new int[n1 + n2];

        for (int i = n1 - 1; i >= 0; i--) {
            for (int j = n2 - 1; j >= 0; j--) {
                int c1 = num1.charAt(i) - '0';
                int c2 = num2.charAt(j) - '0';
                res[i + j + 1] += c1 * c2;
            }
        }

        int carry = 0;
        for (int i = res.length - 1; i >= 0; i--) {
            int temp = (res[i] + carry) % 10;
            carry = (res[i] + carry) / 10;
            res[i] = temp;
        }

        for (int i : res)
            sb.append(i);

        while (sb.length() > 0 && sb.charAt(0) == '0')
            sb.deleteCharAt(0);

        return sb.toString();
    }
}
// @lc code=end
