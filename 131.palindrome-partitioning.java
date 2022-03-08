/*
 * @lc app=leetcode id=131 lang=java
 *
 * [131] Palindrome Partitioning
 */

// @lc code=start
import java.util.*;

class Solution {
    private List<List<String>> res = new ArrayList<>();

    public List<List<String>> partition(String s) {
        checkPalindrome(s, 0, new ArrayList<>());
        return res;
    }

    private void checkPalindrome(String s, int pos, List<String> list) {
        if (pos == s.length() && !list.isEmpty())
            res.add(new ArrayList<>(list));
        for (int i = pos; i < s.length(); i++) {
            if (isPalindrome(s, pos, i)) {
                list.add(s.substring(pos, i + 1));
                checkPalindrome(s, i + 1, list);
                list.remove(list.size() - 1);
            }
        }
    }

    private boolean isPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
}
// @lc code=end
