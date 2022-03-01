/*
 * @lc app=leetcode id=38 lang=java
 *
 * [38] Count and Say
 */

// @lc code=start
class Solution {
    public String countAndSay(int n) {
        if (n == 1)
            return "1";
        String last = countAndSay(n - 1);
        StringBuilder sb = new StringBuilder();
        int i = 0, j = 1;
        while (j < last.length()) {
            if (last.charAt(i) != last.charAt(j)) {
                sb.append(j - i).append(last.charAt(i));
                i = j;
            }
            j++;
        }
        sb.append(j - i).append(last.charAt(i));
        return sb.toString();
    }
}
// @lc code=end
